package level1;

import java.util.Calendar;
enum Day{
    SUN(1), 
    MON(2), 
    TUE(3), 
    WED(4), 
    THU(5),
    FRI(6),
    SAT(7);
    private final int dayNum;
    Day(int dayNum){
        this.dayNum = dayNum;
    }
    public int getDayNum(){
        return this.dayNum;
    }
}

public class Year2016 {
	public Year2016() {
		// TODO Auto-generated constructor stub
	}
	public String solution(int a, int b) throws Exception {
        final Calendar cal = Calendar.getInstance();
        cal.set(2016, --a, b);
        for(Day day : Day.values()){
            if(cal.get(Calendar.DAY_OF_WEEK) == day.getDayNum() ){
                return day.name();
            }
        }
        throw new Exception("날짜 넣으세요!!!!");
    }
}
