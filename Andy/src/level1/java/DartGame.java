package level1.java;

//프로그래머스 Level 1,[1차] 다트 게임
class Dart {
	private String jumsu = "";
	private String d = "";
	private int star = 1;
	private int m = 1;
	
	public int getStar() {
		return star;
	}
	
	public boolean isFinData() {
		if(d.length()>0) return true;
		return false;
	}
	
	public void addJumsu(String str) {
		jumsu += str;
	}
	
	public void setDoubleJumsu(String str) {
		d = str;
	}
	
	public void setStar(int star) {
		this.star = star;
	}
	
	public void setMinus(int m) {
		this.m = m;
	}	
	
	public void init() {
		jumsu = "";
		d = "";
		star = 1;
		m = 1;
	}
	
	public int getJumsu() {
		int doubleScore = 1;
		if(d.compareTo("D") == 0) doubleScore = 2;
		else if(d.compareTo("T") ==0) doubleScore = 3;
		
		int score = Integer.parseInt(jumsu);
		return (int)Math.pow(score, doubleScore) * star * m;
	}
	Dart() {
		init();
	}
	Dart(Dart dart) {
		this.jumsu = dart.jumsu;
		this.d = dart.d;
		this.star = dart.star;
		this.m = dart.m;
	}
}

public class DartGame {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println(solution("1S2D*3T"));
	}
		
    public static int solution(String dartResult) {
        int answer = 0;

     	Dart[] dart = new Dart[4];
     	Dart tmp = new Dart();
     	int i = 0;
     	for(String d:dartResult.split("")) {
     		if(Character.isDigit(d.charAt(0))) {
     			if(tmp.isFinData()) {
                     System.out.println(i);
     				dart[i++] = new Dart(tmp);
     				tmp.init();    				
     			}
     			tmp.addJumsu(d);
     		}
     		else {
     			if(d.compareTo("S") == 0 || d.compareTo("D") == 0 || d.compareTo("T") == 0)
     				tmp.setDoubleJumsu(d);
     			else if(d.compareTo("*") == 0)
     				tmp.setStar(2);
     			else if(d.compareTo("#") == 0)
     				tmp.setMinus(-1);
     		}
     	} 

     	dart[i] = new Dart(tmp);
     	
     	for(int j=2;j>=0;j--) {
     		answer += (dart[j].getJumsu() * (j<2?dart[j+1].getStar():1));
     	}
     	
         
         return answer;
     }	
}


