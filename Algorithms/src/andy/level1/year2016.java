package andy.level1;

import java.util.Calendar;

//프로그래머스 Level 1, 2016년
public class year2016 {
    public String solution(int a, int b) {
    	String[] week = { "","SUN","MON","TUE","WED","THU","FRI","SAT" }; 
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1,b);
        return week[cal.get(Calendar.DAY_OF_WEEK)];
    }
}
