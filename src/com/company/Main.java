package com.company;

import Moduls.DatabaseConnection;

import java.sql.SQLException;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class Main {


        public static void main(String[] args) throws SQLException {
            DatabaseConnection db = new DatabaseConnection();

            char again = 'y';
            Scanner scanner = new Scanner(System.in);


            while (again == 'y') {

                //Parent or child?
                System.out.println("Are you parent or child? p/c");
                char action = scanner.nextLine().charAt(0);

                if (action == 'p' ) {
                    String EnteredBy = "Parent";
                    String Source = "parents watsapp grupa";


                    // On which date do you want to add homework?
                    System.out.println("On which date do you want to add homework?");
                    String DateOfYear = scanner.nextLine();
                    String DayOfWeek = DateOfYear;



                    //Which lesson from 23.05.2021 (math-m, english-e etc)?
                    System.out.println("Which lesson from (math-m, english-e etc)?");
                    String Subject = scanner.nextLine();


                    //Please enter home work in such format (page, task, comment):
                    System.out.println("Please enter home work in such format (page, task, comment): for lesson ");
                    String Tasks = scanner.nextLine();
                    //create java class

                    db.InsertALLDataToHomework(NULL, DayOfWeek,Source,Subject,Tasks,EnteredBy,DateOfYear);

                } else if (action == 'c' ) {
                    String EnteredBy = "Child";
                    db.ReadAllHomeworks();
                }/*else{
                    // check if it not p or c character - what be the next action?
                }*/

            }
            System.out.println("Do you want to do something more? y/n");
            again = scanner.nextLine().charAt(0);


        }


    }



