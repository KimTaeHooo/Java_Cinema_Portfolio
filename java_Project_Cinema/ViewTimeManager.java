package Project5;

public class ViewTimeManager {
    private ViewTime timetable;
    private ViewTime2 timetable2;

    public ViewTimeManager() {
        super();
        timetable = new ViewTime(1, 05, 23, "목", 15, 44);
        timetable2 = new ViewTime2(2, 05, 26, "금", 17, 15);
    }
      
    public ViewTime todaytimetable() {     //상영시간 메소드
        return timetable;
    } 

    public ViewTime2 todaytimetable2() {     //상영시간 메소드
        return timetable2;
    } 
}
