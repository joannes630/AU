import java.awt.BorderLayout;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDatabaseGUI extends JFrame {

    private static final String URL =
            "jdbc:mysql://localhost:3306/SchoolDB";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private final DefaultTableModel model;
    private final JButton loadButton;
    private final JLabel statusLabel;

    public StudentDatabaseGUI() {
        setTitle("Students and Departments");
        setSize(650, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a table whose cells cannot be edited.
        model = new DefaultTableModel(
                new String[]{"ID", "Student Name", "Department"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(model);
        table.setFillsViewportHeight(true);
        table.setAutoCreateRowSorter(true);

        loadButton = new JButton("Load Students");
        loadButton.addActionListener(event -> query());

        statusLabel = new JLabel("Click Load Students to view records.");

        JPanel topPanel = new JPanel();
        topPanel.add(loadButton);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(
                BorderFactory.createEmptyBorder(8, 10, 8, 10));
        bottomPanel.add(statusLabel, BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void query() {
        loadButton.setEnabled(false);
        statusLabel.setText("Loading students...");

        // Run JDBC work in the background to keep the window responsive.
        SwingWorker<DefaultTableModel, Void> worker =
                new SwingWorker<DefaultTableModel, Void>() {

                    @Override
                    protected DefaultTableModel doInBackground()
                            throws SQLException {

                        String sql =
                                "SELECT s.ID, s.Name, "
                                        + "d.Name AS DepartmentName "
                                        + "FROM Student s "
                                        + "JOIN Department d ON s.DeptID = d.ID "
                                        + "ORDER BY s.ID";

                        DefaultTableModel results = new DefaultTableModel(
                                new String[]{
                                        "ID", "Student Name", "Department"
                                }, 0);

                        try (
                                Connection connection =
                                        DriverManager.getConnection(
                                                URL, USERNAME, PASSWORD);

                                PreparedStatement statement =
                                        connection.prepareStatement(sql);

                                ResultSet result =
                                        statement.executeQuery()
                        ) {
                            while (result.next()) {
                                results.addRow(new Object[]{
                                        result.getInt("ID"),
                                        result.getString("Name"),
                                        result.getString("DepartmentName")
                                });
                            }
                        }

                        return results;
                    }

                    @Override
                    protected void done() {
                        try {
                            DefaultTableModel results = get();

                            // Replace the displayed rows after a successful query.
                            model.setRowCount(0);

                            for (int row = 0; row < results.getRowCount(); row++) {
                                model.addRow(new Object[]{
                                        results.getValueAt(row, 0),
                                        results.getValueAt(row, 1),
                                        results.getValueAt(row, 2)
                                });
                            }

                            statusLabel.setText(
                                    model.getRowCount() + " student(s) found.");

                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            statusLabel.setText("Loading interrupted.");

                        } catch (ExecutionException e) {
                            statusLabel.setText("Unable to load students.");

                            JOptionPane.showMessageDialog(
                                    StudentDatabaseGUI.this,
                                    e.getCause().getMessage(),
                                    "Database Error",
                                    JOptionPane.ERROR_MESSAGE
                            );

                        } finally {
                            loadButton.setEnabled(true);
                        }
                    }
                };

        worker.execute();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentDatabaseGUI window = new StudentDatabaseGUI();
            window.setVisible(true);
        });
    }
}