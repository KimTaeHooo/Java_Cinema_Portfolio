package Project5;

public class ViewTime2 {
    private int month;
    private int date;
    private String day;
    private int hour;
    private int minute;
    private int num;

    public ViewTime2(int num, int month, int date, String day, int hour, int minute) {
        this.month = month;
        this.date = date;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.num = num;
    }

    public int getnum() {
        return num;
    }

    public void setnum(int num) {
        this.num = num;
    }

    public int getmonth() {
        return month;
    }

    public void setmonth(int month) {
        this.month = month;
    }

    public int getdate() {
        return date;
    }

    public void setdate(int date) {
        this.date = date;
    }

    public String getday() {
        return day;
    }

    public void setday(String day) {
        this.day = day;
    }

    public int gethour() {
        return hour;
    }

    public void sethour(int hour) {
        this.hour = hour;
    }

    public int getminute() {
        return minute;
    }

    public void setminute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return num + "\t" + month + "월" + date + "일\t " + day + "요일\t " + hour + "시 " + minute + "분";
    }
    
}
