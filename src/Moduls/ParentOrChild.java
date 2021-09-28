package Moduls;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

public class ParentOrChild {
    public static char AskUser() {
        char again = 'y';

        Scanner scanner = new Scanner(System.in);

        while(again == 'y'){
            System.out.println("Are you parent or child?");
            System.out.println("p - parent");
            System.out.println("c - child");
            char action = scanner.nextLine().charAt(0);

            if (action == 'p' || action == 'c') {
                again ='n';
                return action;
            }
        }
        return ' ';
    }
    //Код внизу временно не актуален и перенесён в метод выше
    //Tālāk norādītais kods ir īslaicīgi novecojis un ir pārvietots uz iepriekš minēto metodi














    //Код внизу временно не актуален и перенесён в метод выше
    //Tālāk norādītais kods ir īslaicīgi novecojis un ir pārvietots uz iepriekš minēto metodi


    public static void main(String[] args) {
        char again = 'y';

        Scanner scanner = new Scanner(System.in);
        DatabaseConnection manager = new DatabaseConnection();
       // manager.ConnectToDatabase();

            while(again == 'y'){
                System.out.println("Are you parent or child?");
                System.out.println("p - parent");
                System.out.println("c - child");
                char action = scanner.nextLine().charAt(0);

                if (action == 'p' || action == 'c'){
                    String EnteredBy = scanner.nextLine();
                    DatabaseConnection conn = new DatabaseConnection();
                   // conn.
               // insertALLDataToHomework(manager, EnteredBy);

              /*  }else if (action == 'd'){
                    System.out.println("Enter username that you want to delete");
                    String userName = scanner.nextLine();
                    deleteData(conn,userName);*/
                }
                System.out.println("Do you want to do something more? y/n");
                again = scanner.nextLine().charAt(0);
            }
    }
}

