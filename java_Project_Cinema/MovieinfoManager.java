package Project5;

public class MovieinfoManager {
    private Movieinfo movie;
    private Movieinfo2 movie2;
    
    public MovieinfoManager() {
        movie = new Movieinfo(1, "\t아이언맨\t ", 120, "\t액션\t", 18);
        movie2 = new Movieinfo2(2,"\t구슬치기\t ", 160, "\t코미디\t", 15);        
    
    }

    public Movieinfo todayShow() {   //제목 메소드
        return movie;
        
    }    

    public Movieinfo2 todayshow2() {
        return movie2;
    }

}
