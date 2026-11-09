import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDatabase {

    public static void main(String[] args) {
        query();
    }

    static void query() {
        String url = "jdbc:mysql://localhost:3306/SchoolDB";
        String username = "root";
        String password = "root";

        String sql =
                "SELECT s.ID, s.Name, d.Name AS DepartmentName " +
                        "FROM Student s " +
                        "JOIN Department d " +
                        "ON s.DeptID = d.ID ";
        try (
                Connection connection =
                        DriverManager.getConnection(url, username, password);

                PreparedStatement statement =
                        connection.prepareStatement(sql);

                ResultSet result =
                        statement.executeQuery()
        ) {
            System.out.println("Connected to the database.");
            System.out.println();
            System.out.printf(
                    "%-10s %-25s %-25s%n",
                    "ID", "Student Name", "Department"
            );
            System.out.println(
                    "------------------------------------------------------------"
            );
            while (result.next()) {
                int studentID = result.getInt("ID");
                String studentName = result.getString("Name");
                String departmentName = result.getString("DepartmentName");

                System.out.printf(
                        "%-10d %-25s %-25s%n",
                        studentID,
                        studentName,
                        departmentName
                );
            }
        }
        catch (SQLException e) {
            System.out.println("Database error:");
            System.out.println(e.getMessage());
        }
    }
}