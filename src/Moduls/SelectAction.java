package Moduls;

import java.util.Scanner;

public class SelectAction {
    public static char AskParent() {
        char again = 'y';

        Scanner scanner = new Scanner(System.in);

        while(again == 'y'){
            System.out.println("What do you want to do?");
            System.out.println("h - read all homeworks");
            System.out.println("i - insert additional homework");
            char action = scanner.nextLine().charAt(0);

            if (action == 'h' || action == 'i') {
                again ='n';
                return action;
            }
        }
        return ' ';
    }

    public static char AskChild() {
        char again = 'y';

        Scanner scanner = new Scanner(System.in);

        while(again == 'y'){
            System.out.println("What do you want to do?");
            System.out.println("h - read all homeworks");
            System.out.println("p - prepare for school schedule");
            char action = scanner.nextLine().charAt(0);

            if (action == 'h' || action == 'p') {
                again ='n';
                return action;
            }
        }
        return ' ';
    }
}
