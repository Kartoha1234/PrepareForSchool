package Moduls;
import java.sql.*;
import java.util.ArrayList;
import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DatabaseConnection {
    public void ConnectToDatabase() {
        final String dbURL = "jdbc:mysql://localhost:3306/prepareforschool";
        final String user = "root";
        final String password = "Zemene34";
        try (Connection conn = DriverManager.getConnection(dbURL, user, password)) {
            ArrayList<Homeworks> allHomeworks = ReadAllHomeworks(conn);

            // Ka izsaukt InsertAllDataToHomework metodi?

            System.out.println("Is connected");
        } catch (SQLException e) {
            System.out.println("Something went wrong");
        }
    }

    public ArrayList<Homeworks> ReadAllHomeworks(Connection conn) throws SQLException {
        String sql = "SELECT * FROM homeworks";

        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        ArrayList<Homeworks> result = new ArrayList<Homeworks>();

        while (resultSet.next()) {

            Homeworks homework = new Homeworks(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7));

            result.add(homework);
        }
        return result;

    }

    public static void insertALLDataToHomework(Connection conn, Integer HomeworksID, String DayOfWeek, String Source, String Subject, String Tasks, String EnteredBy, String DateOfYear) throws SQLException {
        String sql = "INSERT INTO users (hw_id, day_of_week, subject, source, tasks, entered_by, date_of_year) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, HomeworksID);
        preparedStatement.setString(2, DayOfWeek);
        preparedStatement.setString(3, Subject);
        preparedStatement.setString(4, Source);
        preparedStatement.setString(5, Tasks);
        preparedStatement.setString(6, EnteredBy);
        preparedStatement.setString(7, DateOfYear);
        int rowInserted = preparedStatement.executeUpdate();
        if (rowInserted > 0) {
            System.out.println("Homework is successfully added");
        } else {
            System.out.println("Something went wrong");
        }
}


       /* public ArrayList<PrepareForSchool> ReadAllPrepareForSchool (Connection conn) throws SQLException{
            String sql2 = "SELECT * FROM prepareforschool";

            Statement statement2 = conn.createStatement();
            ResultSet resultSet2 = statement2.executeQuery(sql2);

            ArrayList<PrepareForSchool> result = new ArrayList<PrepareForSchool>();


            while (resultSet2.next()) {
                int PfsId = resultSet2.getInt(1);
                String DayOfWeek = resultSet2.getString(2);
                String Subject = resultSet2.getString(3);
                String  Quarter = resultSet2.getString(4);

                String output = "Prepareforschool info: \n\t ID: %d \n\t day of week: %s \n\t subject: %s " +
                        "\n\t quarter: %s";

                System.out.println(String.format(output, PfsId, DayOfWeek, Subject, Quarter));

            }
        }*/

}