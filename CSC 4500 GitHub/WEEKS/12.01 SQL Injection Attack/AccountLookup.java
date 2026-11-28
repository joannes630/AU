import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public final class AccountLookup extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final String DB_URL =
            "jdbc:mysql://178.128.145.35:3306/account_lab?connectTimeout=5000&socketTimeout=10000";

    private static final String DB_USER = "student";
    private static final String DB_PASSWORD = "CSC4500Rocks!";

    public AccountLookup() {
        super("Account Lookup");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel menu = new JPanel(new GridLayout(0, 1, 10, 10));
        menu.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        addMenuButton(menu, "Find account", this::findAccount);
        addMenuButton(menu, "Exit", this::dispose);

        add(menu);
        pack();
        setMinimumSize(new Dimension(300, 145));
        setLocationRelativeTo(null);
    }

    private void addMenuButton(JPanel panel, String text, Runnable action) {
        JButton button = new JButton(text);
        button.addActionListener(event -> action.run());
        panel.add(button);
    }

    private void findAccount() {
        JTextField username = new JTextField(20);
        JPasswordField password = new JPasswordField(20);
        JPanel form = new JPanel(new GridLayout(0, 2, 10, 10));
        form.add(new JLabel("Account username"));
        form.add(username);
        form.add(new JLabel("Account password"));
        form.add(password);

        int choice = JOptionPane.showConfirmDialog(this, form, "Find Account",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String accountPassword = readPassword(password);
        if (choice != JOptionPane.OK_OPTION) {
            return;
        }

        if (username.getText().isBlank() || accountPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter both a username and a password.",
                    "Missing input", JOptionPane.WARNING_MESSAGE);
            return;
        }

        showQueryResults("Account Record", username.getText(), accountPassword);
    }

    private void showQueryResults(String title, String username, String password) {
        JDialog dialog = new JDialog(this, title, false);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JLabel status = new JLabel("Loading results...");
        status.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTable table = new JTable();
        table.setFillsViewportHeight(true);
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(event -> dialog.dispose());

        JPanel bottom = new JPanel(new BorderLayout());
        bottom.add(status, BorderLayout.CENTER);
        bottom.add(closeButton, BorderLayout.EAST);
        dialog.add(new JScrollPane(table), BorderLayout.CENTER);
        dialog.add(bottom, BorderLayout.SOUTH);
        dialog.setSize(710, 240);
        dialog.setLocationRelativeTo(this);

        SwingWorker<DefaultTableModel, Void> worker = new SwingWorker<>() {
            @Override
            protected DefaultTableModel doInBackground() throws SQLException {
                try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                    Statement statement = connection.createStatement()) {
                    String sql = "SELECT * FROM Account "
                            + "WHERE username = '" + username
                            + "' AND password = '" + password + "'";
                    if (!statement.execute(sql)) {
                        throw new SQLException("The account lookup did not return a result set.");
                    }

                    try (ResultSet results = statement.getResultSet()) {
                        String[] columns = {"Username", "SSN", "Address", "Phone Number"};
                        DefaultTableModel model = new DefaultTableModel(columns, 0) {
                            @Override
                            public boolean isCellEditable(int row, int column) {
                                return false;
                            }
                        };
                        while (results.next()) {
                            model.addRow(new Object[]{
                                    results.getString("username"),
                                    results.getString("ssn"),
                                    results.getString("address"),
                                    results.getString("phone_number")
                            });
                        }
                        return model;
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
                    status.setText(model.getRowCount() == 0
                            ? "No matching account." : "Account found.");
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                    status.setText("Query interrupted.");
                } catch (ExecutionException exception) {
                    status.setText("Unable to load results.");
                    JOptionPane.showMessageDialog(dialog, exception.getCause().getMessage(),
                            "Database Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        dialog.setVisible(true);
        worker.execute();
    }

    private static String readPassword(JPasswordField field) {
        char[] chars = field.getPassword();
        String password = new String(chars);
        Arrays.fill(chars, '\0');
        field.setText("");
        return password;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AccountLookup().setVisible(true));
    }
}
