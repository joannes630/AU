import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.concurrent.ExecutionException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class CourseEnrollmentApp2 extends JFrame {

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/CourseEnrollmentDB";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public CourseEnrollmentApp2() {
        super("Course Enrollment");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel menu = new JPanel(new GridLayout(0, 1, 10, 10));
        menu.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        addMenuButton(menu, "1. Insert student values", () ->
                showForm(
                        "Student",
                        new String[]{
                                "StudentID", "FirstName", "LastName",
                                "ClassLevel", "Email"
                        },
                        new int[]{
                                Types.INTEGER, Types.VARCHAR, Types.VARCHAR,
                                Types.VARCHAR, Types.VARCHAR
                        },
                        new boolean[]{true, true, true, false, false}
                ));

        addMenuButton(menu, "2. Insert student phone numbers", () ->
                showForm(
                        "StudentPhone",
                        new String[]{"StudentID", "Phone"},
                        new int[]{Types.INTEGER, Types.VARCHAR},
                        new boolean[]{true, true}
                ));

        addMenuButton(menu, "3. Insert course values", () ->
                showForm(
                        "Course",
                        new String[]{
                                "CourseCode", "CourseTitle", "Description",
                                "CreditHours", "Department"
                        },
                        new int[]{
                                Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
                                Types.INTEGER, Types.VARCHAR
                        },
                        new boolean[]{true, true, false, true, false}
                ));

        addMenuButton(menu, "4. Insert enrollment values", () ->
                showForm(
                        "Enrollment",
                        new String[]{
                                "StudentID", "CourseCode", "Semester",
                                "EnrollmentDate", "Grade"
                        },
                        new int[]{
                                Types.INTEGER, Types.VARCHAR, Types.VARCHAR,
                                Types.DATE, Types.VARCHAR
                        },
                        new boolean[]{true, true, true, true, false}
                ));

        addMenuButton(menu, "5. List all students", () ->
                showQueryResults(
                        "All Students",
                        "SELECT StudentID, FirstName, LastName, ClassLevel, Email "
                                + "FROM Student "
                                + "ORDER BY StudentID"
                ));

        addMenuButton(menu, "6. List student phone numbers", () ->
                showQueryResults(
                        "Student Phone Numbers",
                        "SELECT s.StudentID, s.FirstName, s.LastName, sp.Phone "
                                + "FROM Student AS s "
                                + "LEFT JOIN StudentPhone AS sp "
                                + "ON s.StudentID = sp.StudentID "
                                + "ORDER BY s.StudentID"
                ));

        addMenuButton(menu, "7. Find courses by student ID",
                this::findStudentCourses);

        addMenuButton(menu, "Exit", this::dispose);
        add(menu);
        pack();
        setMinimumSize(new Dimension(380, 300));
        setLocationRelativeTo(null);
    }

    private void addMenuButton(
            JPanel panel, String text, Runnable action) {

        JButton button = new JButton(text);
        button.addActionListener(event -> action.run());
        panel.add(button);
    }

    private void showForm(
            String table,
            String[] columns,
            int[] types,
            boolean[] required) {

        JDialog dialog = new JDialog(
                this, "Insert into " + table, true);

        JPanel fieldsPanel = new JPanel(
                new GridLayout(columns.length, 2, 10, 10));

        JTextField[] inputs = new JTextField[columns.length];

        for (int i = 0; i < columns.length; i++) {
            String label = columns[i];

            if (types[i] == Types.DATE) {
                label += " (YYYY-MM-DD)";
            }

            if (required[i]) {
                label += " *";
            }

            fieldsPanel.add(new JLabel(label));

            inputs[i] = new JTextField(25);
            fieldsPanel.add(inputs[i]);
        }

        JButton saveButton = new JButton("Insert");
        JButton cancelButton = new JButton("Close");

        cancelButton.addActionListener(event -> dialog.dispose());

        saveButton.addActionListener(event -> {
            final Object[] values;

            try {
                values = readValues(columns, types, required, inputs);
            } catch (IllegalArgumentException exception) {
                JOptionPane.showMessageDialog(
                        dialog,
                        exception.getMessage(),
                        "Invalid input",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            saveButton.setEnabled(false);
            saveButton.setText("Saving...");

            new SwingWorker<Integer, Void>() {

                @Override
                protected Integer doInBackground() throws SQLException {
                    return insertRecord(table, columns, types, values);
                }

                @Override
                protected void done() {
                    saveButton.setEnabled(true);
                    saveButton.setText("Insert");

                    try {
                        get();

                        JOptionPane.showMessageDialog(
                                dialog,
                                "Record inserted successfully."
                        );

                        for (JTextField input : inputs) {
                            input.setText("");
                        }

                        inputs[0].requestFocusInWindow();

                    } catch (InterruptedException exception) {
                        Thread.currentThread().interrupt();

                        JOptionPane.showMessageDialog(
                                dialog,
                                "The operation was interrupted.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );

                    } catch (ExecutionException exception) {
                        Throwable cause = exception.getCause();

                        JOptionPane.showMessageDialog(
                                dialog,
                                "Could not insert the record:\n"
                                        + cause.getMessage(),
                                "Database error",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                }
            }.execute();
        });

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttons.add(saveButton);
        buttons.add(cancelButton);

        JPanel content = new JPanel(new BorderLayout(10, 15));
        content.setBorder(
                BorderFactory.createEmptyBorder(15, 15, 15, 15));

        content.add(new JLabel("* Required field"), BorderLayout.NORTH);
        content.add(fieldsPanel, BorderLayout.CENTER);
        content.add(buttons, BorderLayout.SOUTH);

        dialog.setContentPane(content);
        dialog.getRootPane().setDefaultButton(saveButton);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    private Object[] readValues(
            String[] columns,
            int[] types,
            boolean[] required,
            JTextField[] inputs) {

        Object[] values = new Object[columns.length];

        for (int i = 0; i < columns.length; i++) {
            String text = inputs[i].getText().trim();

            if (text.isEmpty()) {
                if (required[i]) {
                    throw new IllegalArgumentException(
                            columns[i] + " is required.");
                }

                values[i] = null;
                continue;
            }

            if (types[i] == Types.INTEGER) {
                try {
                    int value = Integer.parseInt(text);

                    if (columns[i].equals("CreditHours") && value <= 0) {
                        throw new IllegalArgumentException(
                                "CreditHours must be greater than zero.");
                    }

                    values[i] = value;

                } catch (NumberFormatException exception) {
                    throw new IllegalArgumentException(
                            columns[i] + " must be a whole number.");
                }

            } else if (types[i] == Types.DATE) {
                try {
                    values[i] = Date.valueOf(LocalDate.parse(text));
                } catch (DateTimeParseException exception) {
                    throw new IllegalArgumentException(
                            columns[i]
                                    + " must be a valid date in YYYY-MM-DD format.");
                }

            } else {
                values[i] = text;
            }
        }

        return values;
    }

    private int insertRecord(
            String table,
            String[] columns,
            int[] types,
            Object[] values) throws SQLException {

        // Table and column names come only from the fixed menu definitions.
        String placeholders = String.join(
                ", ", java.util.Collections.nCopies(columns.length, "?"));

        String sql = "INSERT INTO " + table
                + " (" + String.join(", ", columns) + ")"
                + " VALUES (" + placeholders + ")";

        try (Connection connection = DriverManager.getConnection(
                DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement =
                     connection.prepareStatement(sql)) {

            for (int i = 0; i < values.length; i++) {
                if (values[i] == null) {
                    statement.setNull(i + 1, types[i]);
                } else {
                    statement.setObject(i + 1, values[i], types[i]);
                }
            }

            return statement.executeUpdate();
        }
    }

    private void findStudentCourses() {
        String input = JOptionPane.showInputDialog(
                this,
                "Enter student ID:",
                "Find Student Courses",
                JOptionPane.QUESTION_MESSAGE
        );

        if (input == null) {
            return; // User clicked Cancel.
        }

        final int studentID;

        try {
            studentID = Integer.parseInt(input.trim());
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(
                    this,
                    "Enter a valid whole-number student ID.",
                    "Invalid Student ID",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        String sql =
                "SELECT s.FirstName, s.LastName, c.CourseTitle AS `Course Title`, "
                        + "e.Semester, e.Grade "
                        + "From Student as s "
                        + "JOIN Enrollment as e "
                        + "ON s.StudentID = e.StudentID "
                        + "JOIN Course AS c "
                        + "ON e.CourseCode = c.CourseCode "
                        + "WHERE e.StudentID = ? "
                        + "ORDER BY e.EnrollmentDate, c.CourseTitle";

        showQueryResults(
                "Courses for Student " + studentID,
                sql,
                String.valueOf(studentID)
        );
    }
    private void showQueryResults(String title, String sql, String... parameters) {
        JDialog dialog = new JDialog(this, title, false);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JLabel status = new JLabel("Loading results...");
        status.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTable table = new JTable();
        table.setFillsViewportHeight(true);
        table.setAutoCreateRowSorter(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(event -> dialog.dispose());

        JPanel bottom = new JPanel(new BorderLayout());
        bottom.add(status, BorderLayout.CENTER);
        bottom.add(closeButton, BorderLayout.EAST);

        dialog.add(new JScrollPane(table), BorderLayout.CENTER);
        dialog.add(bottom, BorderLayout.SOUTH);
        dialog.setSize(800, 400);
        dialog.setLocationRelativeTo(this);

        SwingWorker<DefaultTableModel, Void> worker =
                new SwingWorker<DefaultTableModel, Void>() {

                    @Override
                    protected DefaultTableModel doInBackground()
                            throws SQLException {

                        try (Connection connection = DriverManager.getConnection(
                                DB_URL, DB_USER, DB_PASSWORD);
                             PreparedStatement statement =
                                     connection.prepareStatement(sql)) {

                            for (int i = 0; i < parameters.length; i++) {
                                statement.setString(i + 1, parameters[i]);
                            }

                            try (ResultSet results = statement.executeQuery()) {
                                // Keep your existing code here that reads the results
                                // and returns the DefaultTableModel.
                                ResultSetMetaData metadata = results.getMetaData();
                                int columnCount = metadata.getColumnCount();

                                String[] columnNames = new String[columnCount];

                                for (int i = 0; i < columnCount; i++) {
                                    columnNames[i] = metadata.getColumnLabel(i + 1);
                                }

                                List<Object[]> rows = new ArrayList<>();

                                while (results.next()) {
                                    Object[] row = new Object[columnCount];

                                    for (int i = 0; i < columnCount; i++) {
                                        row[i] = results.getObject(i + 1);
                                    }

                                    rows.add(row);
                                }
                                return new DefaultTableModel(
                                        rows.toArray(new Object[0][]),
                                        columnNames) {

                                    @Override
                                    public boolean isCellEditable(int row, int column) {
                                        return false;
                                    }
                                };
                            }
                        }
                    }

                    @Override
                    protected void done() {
                        if (!dialog.isDisplayable()) {
                            return;
                        }

                        try {
                            DefaultTableModel model = get();
                            table.setModel(model);

                            status.setText(
                                    model.getRowCount() + " record(s) found.");

                        } catch (InterruptedException exception) {
                            Thread.currentThread().interrupt();
                            status.setText("Query interrupted.");

                        } catch (ExecutionException exception) {
                            status.setText("Unable to load results.");

                            JOptionPane.showMessageDialog(
                                    dialog,
                                    "Query failed:\n"
                                            + exception.getCause().getMessage(),
                                    "Database Error",
                                    JOptionPane.ERROR_MESSAGE
                            );
                        }
                    }
                };

        dialog.setVisible(true);
        worker.execute();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CourseEnrollmentApp2 app = new CourseEnrollmentApp2();
            app.setVisible(true);
        });
    }
}