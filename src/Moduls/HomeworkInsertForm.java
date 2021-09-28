package Moduls;

import java.util.Scanner;

public class HomeworkInsertForm {
    public static boolean AskUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter homework ID");
        int homeworkID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter day of week: ");
        String dayOfWeek = scanner.nextLine();
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();
        System.out.println("Enter source: ");
        String source = scanner.nextLine();
        System.out.println("Enter tasks: ");
        String tasks = scanner.nextLine();
        System.out.println("Enter your name: ");
        String enteredBy = scanner.nextLine();
        System.out.println("Enter date in format: year-month-day: ");
        String dateOfYear = scanner.nextLine();
        try {
            DatabaseConnection dbManager = new DatabaseConnection();
            dbManager.InsertDataToHomework(homeworkID,dayOfWeek,source,subject,tasks,enteredBy,dateOfYear);
            return true;
        } catch (Exception e){
            System.out.println("Something went wrong");
            return false;
        }
    }
}
