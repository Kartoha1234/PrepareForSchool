package Moduls;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Scanner;

import static java.sql.Types.NULL;


public class ParentOrChild {
    public static void main(String[] args) {

        char again = 'y';
        Scanner scanner = new Scanner(System.in);
        DatabaseConnection manager = new DatabaseConnection();
        try (Connection conn = DriverManager.getConnection(manager.dbURL, manager.user, manager.password)) {
            //System.out.println("Connected");

            while (again == 'y') {

                //Parent or child?
                System.out.println("Are you parent or child? p/c");
                char action = scanner.nextLine().charAt(0);

                if (action == 'p' ) {
                    String EnteredBy = "Parent";
                    String Source = "parents watsapp grupa";
                    //manager.InsertALLDataToHomework(conn,NULL, "",Source,"","",EnteredBy,"");


                    // On which date do you want to add homework?
                    System.out.println("On which date do you want to add homework?");
                    String DateOfYear = scanner.nextLine();
                    String DayOfWeek = DateOfYear;

                   /* ParentWhichDate parentWhichDate = new ParentWhichDate();
                    parentWhichDate.parentWhichDate(DateOfYear);
                    parentWhichDate.getDayOfWeek();*/

                    //manager.InsertALLDataToHomework(conn,NULL, DayOfWeek,Source,"","",EnteredBy,DateOfYear);

                   //Which lesson from 23.05.2021 (math-m, english-e etc)?
                    System.out.println("Which lesson from (math-m, english-e etc)?");
                    String Subject = scanner.nextLine();
                    // create java class

                   //manager.InsertALLDataToHomework(conn,NULL, DayOfWeek,Source,Subject,"",EnteredBy,DateOfYear);

                    //Please enter home work in such format (page, task, comment):
                    System.out.println("Please enter home work in such format (page, task, comment): for lesson ");
                    String Tasks = scanner.nextLine();
                    //create java class

                    manager.InsertALLDataToHomework(conn,NULL, DayOfWeek,Source,Subject,Tasks,EnteredBy,DateOfYear);

                } else if (action == 'c' ) {
                    String EnteredBy = "Child";
                    manager.ReadAllHomeworks(conn);
                }else{
                    // check if it not p or c character - what be the next action?
                }






              /*  }else if (action == 'd'){
                    System.out.println("Enter username that you want to delete");
                    String userName = scanner.nextLine();
                    deleteData(conn,userName);*/
                }
                System.out.println("Do you want to do something more? y/n");
                again = scanner.nextLine().charAt(0);


        }catch (SQLException e){
            System.out.println("Error: " + e);
        }


    }
}

