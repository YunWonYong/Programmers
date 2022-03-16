package level2.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//프로그래머스 Level 2,[1차] 뉴스 클러스터링
public class news_clustering {
    public void stringSplit(List<String> list,String str1) {
		str1 = str1.toUpperCase();
		for(int i=1;i<str1.length();i++) {
			char ch1 = str1.charAt(i-1);
			char ch2 = str1.charAt(i);
			if(Character.isLetter(ch1) && Character.isLetter(ch2)) 
				list.add(""+ch1 + ch2);
		}
        Collections.sort(list);
    }
	
	
    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        stringSplit(list1,str1);
        stringSplit(list2,str2);
        
        int union=0,inter=0;
        int i1=0,i2=0;
        while(true) {
        	if(list1.size() <= i1 || list2.size() <= i2) {
        		break;
        	}
        	
        	String a = list1.get(i1);
        	String b = list2.get(i2);
        	
        	int compare = a.compareTo(b);
        	if(compare == 0) {
        		inter++;
        		i1++;
        		i2++;
        	}
        	else if(compare>0) {
        		i2++;
        	}
        	else {
        		i1++;
        	}
        }

        union = list1.size() + list2.size() - inter;
        
        double result=0;
        if(union==0 && inter==0)
        	result = 1;
        else 
        	result = (double)inter/union;
        
        return (int)(result*65536);
    }
}
