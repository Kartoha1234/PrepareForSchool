package com.company;

import Moduls.DatabaseConnection;

import java.sql.SQLException;
import java.util.Locale;
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



                System.out.println("Pievieno mājas darbu. Priekšmets: " + Subject);
                String tasks = addTask();

                db.InsertALLDataToHomework(NULL, DayOfWeek,Source,Subject,tasks,EnteredBy,DateOfYear);

            } else if (action == 'c' ) {

                System.out.println("Do you want to see lessons or do homework? l/h");
                if (action == 'l' ) {

                    System.out.println("On which day do you want to see lessons?");
                    String DayOfWeek = scanner.nextLine();
                    //check that entered Monday/Tuesday.../

                    System.out.println("List of lessons on " + DayOfWeek + ": ");
                    // read from database list of lessons on selected dateOfWeek
                    // from DB: pfs_id and subject
                    //db.ReadAllPrepareForSchool();

                }


            } else if (action == 'h' ) {
                db.ReadAllHomeworks();
            }

        }
        System.out.println("Do you want to do something more? y/n");
        again = scanner.nextLine().charAt(0);


    }
    public static String  addTask () {

        Scanner scanner = new Scanner(System.in);
        String tasks;

        System.out.println("Kāda lapaspuse? piem. 15. Ja nav ievadit 0");
        while(!scanner.hasNextInt() ){
            String lpp = scanner.next().toLowerCase().trim();
            System.out.println("Kāda lapaspuse? piem. 15");
        }
        String lpp = scanner.next().toLowerCase().trim();

        System.out.println("Kāds uzdevums? piem. 1. Ja nav ievadīt 0");
        while(!scanner.hasNextInt()){
            String uzd = scanner.next().toLowerCase().trim();
            System.out.println("Kāds uzdevums? piem. 1");
        }
        String uzd = scanner.next().toLowerCase().trim();
        scanner.nextLine();

        System.out.println("Papildus komentāri un pārējie uzdevumi:");
        String not = scanner.nextLine().toLowerCase();

        if(lpp.equals("0") && uzd.equals("0") ){
            tasks = not;
        }else if(uzd.equals("0")){
            tasks = lpp +".lpp " + not;
        }else if(lpp.equals("0")){
            tasks = uzd + ".uzd " + not;
        }else{
            tasks = (lpp +".lpp " + uzd + ".uzd " + not);

        }
        System.out.println(tasks);
        return tasks;

    }


}



