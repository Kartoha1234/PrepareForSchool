package com.company;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws SQLException {
        DatabaseConnection db = new DatabaseConnection();
        char again = 'y';
        Scanner scanner = new Scanner(System.in);
        String DayOfWeek = null;


        while (again == 'y') {

            //Parent or child?
            System.out.println("Are you parent or child? p/c");
            char action = scanner.nextLine().toLowerCase().trim().charAt(0);

            if (action == 'p') {
                String EnteredBy = "Parent";
                String Source = "parents watsapp group";


                System.out.println("On which date do you want to add homework? (yyyy-mm-dd)");
                String DateOfYear = scanner.nextLine().trim().toLowerCase();
                Pattern pattern = Pattern.compile("^(\\d{4})-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$");
                Matcher matcher = pattern.matcher (DateOfYear);
                Boolean matches = matcher.matches();


                do{
                    System.out.println("On which date do you want to add homework? (yyyy-mm-dd)");
                    DateOfYear = scanner.nextLine().trim().toLowerCase();
                    pattern = Pattern.compile("^(\\d{4})-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$");
                    matcher = pattern.matcher (DateOfYear);
                    //System.out.println(matcher.matches());
                    matches = matcher.matches();

                }while(!matches);

                try{
                    DayOfWeek = getDayOfWeek(DateOfYear);
                    //System.out.println(DayOfWeek);

                    if (DayOfWeek == "saturday" || DayOfWeek == "sunday") {
                        System.out.println("Entered day is on weekend! This day is for rest!");
                        break;
                    }
                    System.out.println(DayOfWeek + ": ");
                    ArrayList<String> DayNames = new ArrayList<String>(Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

                    if (DayNames.contains(DayOfWeek)) {
                        db.ReadPrepareForSchoolByDay(DayOfWeek);
                    }


                }catch (Exception e){
                }


                String Subject = WhichLesson(DayOfWeek);

                System.out.println("Add homework for a " + Subject);
                String tasks = addTask();

                db.InsertALLDataToHomework(DayOfWeek, Source, Subject, tasks, EnteredBy, DateOfYear);

            } else if (action == 'c') {


                char again2 = 'y';
                while (again2 == 'y') {
                    System.out.println("Do you want to see lessons or do homework? l/h");
                    char action2 = scanner.nextLine().toLowerCase().trim().charAt(0);

                    if (action2 == 'l') {

                        System.out.println("On which date do you want to see lessons? (yyyy-mm-dd)");
                        String DateOfYear = scanner.nextLine().toLowerCase().trim();
                        //String DateOfYear = null;
                        Pattern pattern = Pattern.compile("^(\\d{4})-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$");
                        Matcher matcher = pattern.matcher (DateOfYear);
                       // System.out.println(matcher.matches());
                        Boolean matches = matcher.matches();


                        do{
                            System.out.println("On which date do you want to see lessons? (yyyy-mm-dd)");
                            DateOfYear = scanner.nextLine().toLowerCase().trim();
                            pattern = Pattern.compile("^(\\d{4})-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$");
                            matcher = pattern.matcher (DateOfYear);
                            matches = matcher.matches();

                        }while(!matches);


                        try{
                            DayOfWeek = getDayOfWeek(DateOfYear);

                            System.out.println(DayOfWeek + ": ");
                            ArrayList<String> DayNames = new ArrayList<String>(Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

                            if (DayNames.contains(DayOfWeek)) {
                                db.ReadPrepareForSchoolByDay(DayOfWeek);
                            }

                        }catch (Exception e){

                        }


                } else if (action2 == 'h') {
                        System.out.println("To be done soon, be back in some time!");
                    }


                }

                } else if (action == 'h') {
                db.ReadAllHomeworks();
            }

        }
        System.out.println("Thank you! If you want to work with me again then start over PrepareforSchool app!");
        //again = scanner.nextLine().toLowerCase().trim().charAt(0);

}

        private static String getDayOfWeek(String input) throws Exception{

            String day = null;
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(input);

            Calendar c = Calendar.getInstance();
            c.setTime(date2);
            int dayOfWeekTmp = c.get(Calendar.DAY_OF_WEEK);

            switch(dayOfWeekTmp){
                case 1:
                    day="sunday";
                    break;
                case 2:
                    day="monday";
                    break;
                case 3:
                    day="tuesday";
                    break;
                case 4:
                    day="wednesday";
                    break;
                case 5:
                    day="thursday";
                    break;
                case 6:
                    day="friday";
                    break;
                case 7:
                    day="saturday";
                    break;


            }
            return day;
        }


        public static String  addTask () {

                Scanner scanner = new Scanner(System.in);
                String tasks;

                System.out.println("Which page? ex. 15. If none then add 0");
                while(!scanner.hasNextInt() ){
                    String lpp = scanner.next().toLowerCase().trim();
                    System.out.println("Which page? ex. 15. If none then add 0");
                }
                   String lpp = scanner.next().toLowerCase().trim();

                System.out.println("Which task? ex. 15. If none then add 0");
                while(!scanner.hasNextInt()){
                    String uzd = scanner.next().toLowerCase().trim();
                    System.out.println("Which task? ex. 15. If none then add 0");
                }
                    String uzd = scanner.next().toLowerCase().trim();
                scanner.nextLine();

                System.out.println("Additional tasks and comments:");
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

                return tasks;

            }

    public static String WhichLesson(String day) {
        //Which lesson from 23.05.2021 (math-m, english-e etc)?
        //String Subject = WhichLesson(day);
        //1.nolasam ievadi;
        //2. Pārbaudīt vai tajā dienā ir tāda stunda;
        //2.1. Ja nav, tad atgriežamies pie sākuma;
        //2.
        System.out.println("Which lesson do you want to add homework to?");
        Scanner scanner = new Scanner(System.in);
        String lesson = scanner.nextLine().toLowerCase().trim();
        DatabaseConnection db = new DatabaseConnection();
        // inicializējam tukšu stundu sarakstu
        List<String> lessonsOfTheDay = new ArrayList<>();
        try {
            // mēģinam izveidot savienojumu ar db un ierakstam visas stundas mūsu definētajā stundu sarakstā (KONKTRĒTAJĀ DIENĀ)
            lessonsOfTheDay.addAll(db.GetLessonsForTheDay(day.toLowerCase()));
        } catch (Exception e) {
            e.printStackTrace(); // JA KĻŪDA, TAD APSTĀDINA METODI..
        }

        // pārbaudam vai stundu sarakstā, ko dabūjām no db, ir mūsu ievadītā stunda
        while (!lessonsOfTheDay.contains(lesson)) {
            System.out.println("Lesson was not found! Which lesson do you want to add homework to?");
            lesson = scanner.nextLine().toLowerCase().trim(); //JAUNA VĒRTĪBA MAINĪGAJAM
        }

        return lesson; //TIEK ATGRIEZTA STUNDA
    }

    }



