package com.company;

import Moduls.DatabaseConnection;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
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
                   // String DayOfWeek = getDay();
                        String DayOfWeek = "bbbb";

            //Which lesson from 23.05.2021 (math-m, english-e etc)?
                    System.out.println("Which lesson from (math-m, english-e etc)?");
                    String Subject = scanner.nextLine();



                    System.out.println("Pievieno mājas darbu. Priekšmets: " + Subject);
                    String tasks = addTask();

                    db.InsertALLDataToHomework(NULL, DayOfWeek,Source,Subject,tasks,EnteredBy,DateOfYear);

                } else if (action == 'c' ) {
                    String EnteredBy = "Child";
                    db.ReadAllHomeworks();
                }

            }
            System.out.println("Do you want to do something more? y/n");
            again = scanner.nextLine().charAt(0);


        }

    public static String getDay() throws Exception{
        Scanner scanner = new Scanner(System.in);
//int value;
        Scanner in = new Scanner(System.in);
        System.out.println("Ievadi datumu (GGGG-MM-DD) : ");

        String date = scanner.nextLine();
       //Date date3 = Date.(date);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(date);

        String day = "";

        //String DateOfYear = scanner.nextLine();
        //String DayOfWeek = DateOfYear;
        //ArrayList<String> DateOfYear  = new ArrayList<>();
        // DateOfYear.add("year");
        //DateOfYear.add("month");
        // DateOfYear.add("day");
        // System.out.println(DateOfYear);

        //  String year = in.next();
        // String month = in.next();
        //String day = in.next();


        Calendar c = Calendar.getInstance();
        //c.set(Integer.parseInt(year), Integer.parseInt(month)-1,Integer.parseInt(day));
        //String dayOfWeek = getDayOfWeek(c.get(Calendar.DAY_OF_WEEK));
        c.setTime(date2);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        switch(dayOfWeek){
            case 1:
                day="svetdiena";
                break;
            case 2:
                day="pirmdiena";
                break;
            case 3:
                day="otrdiena";
                break;
            case 4:
                day="trešdiena";
                break;
            case 5:
                day="ceturtdiena";
                break;
            case 6:
                day="piektdiena";
                break;
            case 7:
                day="sestdiena";
                break;
        }

        // System.out.println(dayOfWeek.toLowerCase().trim());
        //  System.out.println(dayOfWeek);
        System.out.println(date);
        System.out.println(date2);

        return day;
    }

    /*private  String getDayOfWeek(int value){

        return day;
    }



            return DayOfWeek;
    }
*/

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



