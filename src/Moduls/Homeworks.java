package Moduls;
import java.util.*;

public class Homeworks {
    private int HomeworksID;
    private String DayOfWeek;
    private String Subject;
    private String Source;
    private String Tasks;
    private String EnteredBy;
    private String DateOfYear;

    public Homeworks(int id, String day, String subject, String source, String tasks, String enteredBy, String dateOfYear) {
        HomeworksID = id;
        DayOfWeek = day;
        Subject = subject;
        Source = source;
        Tasks = tasks;
        EnteredBy = enteredBy;
        DateOfYear = dateOfYear;
    }
    public int GetId() {
        return HomeworksID;
    }
    public String GetDay(){
        return DayOfWeek;
    }
    public String GetSubject(){
        return Subject;
    }
    public String GetSource(){
        return Source;
    }
    public String GetTasks(){
        return Tasks;
    }
    public String GetEnteredBy(){
        return EnteredBy;
    }
    public String GetDateOfYear(){
        return DateOfYear;
    }
}
