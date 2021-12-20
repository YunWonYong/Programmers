package level1.java;

// 신규 아이디 추천
public class RecommendNewId {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9._-]", "");
        new_id = new_id.replaceAll("[.]{1,}", ".");
        if(new_id.length()>0 && new_id.charAt(0) == '.') new_id = new_id.substring(1);
        if(new_id.length()>0 && new_id.charAt(new_id.length()-1) == '.') new_id = new_id.substring(0,new_id.length()-1);
        if(new_id.length()==0) new_id = "a";
        if(new_id.length()>15) new_id = new_id.substring(0,15);
        if(new_id.charAt(new_id.length()-1) == '.') new_id = new_id.substring(0,new_id.length()-1);
        if(new_id.length() <= 2) {
        	String tmp = ""+ new_id.charAt(new_id.length() - 1);
        	new_id = new_id + tmp.repeat(3-new_id.length());
        }
        return new_id;
    }	

}
