import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class StudentEntryGUI extends JFrame {

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/university";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    private final JTextField idField = new JTextField(20);
    private final JTextField nameField = new JTextField(20);
    private final JTextField majorField = new JTextField(20);
    private final JButton saveButton = new JButton("Save Student");

    public StudentEntryGUI() {
        super("Student Registration");

        JPanel form = new JPanel(new GridLayout(3, 2, 10, 10));
        form.add(new JLabel("Student ID:"));
        form.add(idField);
        form.add(new JLabel("Name:"));
        form.add(nameField);
        form.add(new JLabel("Major:"));
        form.add(majorField);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(form, BorderLayout.CENTER);
        panel.add(saveButton, BorderLayout.SOUTH);

        saveButton.addActionListener(event -> saveStudent());

        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    private void saveStudent() {
        // Read and validate input before accessing the database.
        final int studentId;

        try {
            studentId = Integer.parseInt(idField.getText().trim());

            if (studentId <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException exception) {
            showMessage("Enter a positive whole number for Student ID.");
            return;
        }

        String name = nameField.getText().trim();
        String major = majorField.getText().trim();

        if (name.isEmpty() || major.isEmpty()) {
            showMessage("Please enter both a name and a major.");
            return;
        }

        if (name.length() > 100 || major.length() > 100) {
            showMessage("Name and major must each be 100 characters or fewer.");
            return;
        }

        saveButton.setEnabled(false);

        // Run database work in the background so the GUI stays responsive.
        SwingWorker<String, Void> worker = new SwingWorker<>() {

            @Override
            protected String doInBackground() throws SQLException {
                String sql =
                        "INSERT INTO students (student_id, name, major) "
                                + "VALUES (?, ?, ?)";

                try (Connection connection = DriverManager.getConnection(
                        DB_URL, DB_USER, DB_PASSWORD);
                     PreparedStatement statement =
                             connection.prepareStatement(sql)) {

                    statement.setInt(1, studentId);
                    statement.setString(2, name);
                    statement.setString(3, major);

                    statement.executeUpdate();
                    return "Student saved successfully!";
                }
            }

            @Override
            protected void done() {
                try {
                    String message = get();
                    showMessage(message);

                    idField.setText("");
                    nameField.setText("");
                    majorField.setText("");
                    idField.requestFocusInWindow();

                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                    showMessage("The operation was interrupted.");

                } catch (java.util.concurrent.ExecutionException exception) {
                    Throwable cause = exception.getCause();

                    if (cause instanceof SQLException
                            && ((SQLException) cause).getErrorCode() == 1062) {
                        showMessage("That Student ID already exists.");
                    } else {
                        showMessage("Unable to save: " + cause.getMessage());
                    }

                } finally {
                    saveButton.setEnabled(true);
                }
            }
        };

        worker.execute();
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new StudentEntryGUI().setVisible(true));
    }
}