package Project5;

public class Movieinfo2 {
    private String movieName;  //필드선언
    private int runtime;
    private String ganre;
    private int grade;
    private int num;

    public Movieinfo2(int num, String movieName, int runtime, String ganre, int grade) {    //생성자 및 초기화
        this.movieName = movieName;
        this.runtime = runtime;
        this.ganre = ganre;
        this.grade = grade;
        this.num = num;
   }

   public int getnum() {
    return num;
   }

   public void setnum(int num) {
    this.num = num;
   }

   public String getMovieName() {
    return movieName;
   }

   public void setMovieName(String movieName) {
    this.movieName = movieName;
   }

   public int getruntime() {
    return runtime;
   }

   public void setruntime(int runtime) {
    this.runtime = runtime;
   }

   public String getganre() {
    return ganre;
   }

   public void setganre(String ganre) {
    this.ganre = ganre;
   }

   public int getgrade() {
    return grade;
   }

   public void setgrade(int grade) {
    this.grade = grade;
   }

   @Override
   public String toString() {              //문장 오버라이딩
    return num + movieName + runtime + "분" + ganre + grade;

   }


    

}
