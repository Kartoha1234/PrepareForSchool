package Moduls;
import java.util.*;

public class PrepareForSchool {
    private int PfsId;
    private String DayOfWeek;
    private String Subject;
    private int Quarter;

    public PrepareForSchool(int id, String day, String subject, int quarter) {
        PfsId = id;
        DayOfWeek = day;
        Subject = subject;
        Quarter = quarter;
    }
    public int GetId() {
        return PfsId;
    }
    public String GetDay(){
        return DayOfWeek;
    }
    public String GetSubject(){
        return Subject;
    }
    public int GetQuarter(){
        return Quarter;
    }
}

