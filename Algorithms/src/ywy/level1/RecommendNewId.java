package ywy.level1;

public class RecommendNewId {
	public RecommendNewId() {}
    public String solution(String new_id) {
    	String temp = blankText(new_id); 
        if(!temp.equals(new_id)) {
        	return temp;
        }
        temp = new_id.toLowerCase();
        temp = temp.replaceAll("[^0-9a-z\\-\\_\\.]", "").replaceAll("[\\.]{1,}", ".");
        temp = blankText(frontBackDotRemove(temp));
        return temp.length() < 3 ? lastCharAppend(temp) : temp.length() > 14 ? textCheck(temp) : temp; 
    }
    
    private String frontBackDotRemove(Str ing str) {
    	return backDotRemove(str.replaceAll("^[\\.]", ""));
    }
    
    private String backDotRemove(String str) {
    	return str.replaceAll("[\\.]$", "");
    }
    
    private String textCheck(String str) {
    	String temp = str.substring(0, 15);
    	return backDotRemove(temp);
    }
    
    private String lastCharAppend(String str) {
    	String temp = str.substring(str.length() - 1, str.length());
    	while(true) {
    		str += temp;
    		if (str.length() == 3) {
    			return str;
    		}
    	}
    }
    private String blankText(String str) {
    	if (str != null && str.length() > 0) {
    		return str;
    	}
    	return "aaa";
    }
}
