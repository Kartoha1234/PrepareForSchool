package Moduls;

import java.sql.Connection;
import java.util.ArrayList;

public class BaseFlow {
    public static void ExecuteFlow() {
        char whoIs = ParentOrChild.AskUser();
        if (whoIs =='p'){
            char action = SelectAction.AskParent();
            if (action =='h'){
                DatabaseConnection dbManager = new DatabaseConnection();
                try {
                    ArrayList<Homeworks> allHomeworks = dbManager.ReadAllHomeworks();
                    for (int i = 0; i < allHomeworks.size(); i++){
                        Homeworks homework = allHomeworks.get(i);
                        System.out.println("_______________");
                        System.out.println("ID: " + homework.GetId());
                        System.out.println("Day od week: " + homework.GetDay());
                        System.out.println("Subject: " + homework.GetSubject());
                        System.out.println("Source: "+ homework.GetSource());
                        System.out.println("Tasks: " + homework.GetTasks());
                        System.out.println("Entered by: " + homework.GetEnteredBy());
                        System.out.println("Date of year: " + homework.GetDateOfYear());
                    }
                } catch (Exception e){
                    System.out.println("Something went wrong");
                }
            }
            else if(action =='i'){
                boolean created = HomeworkInsertForm.AskUserInput();
                if(created == true){
                    System.out.println("Homework created");
                }
                else {
                    System.out.println("Something went wrong");
                }
            }
        }
        else if (whoIs =='c'){
        }
    }
}
