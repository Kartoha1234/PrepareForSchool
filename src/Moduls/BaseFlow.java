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
