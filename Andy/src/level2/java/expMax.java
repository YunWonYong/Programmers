package level2.java;

import java.util.*;

//프로그래머스 Level 2,수식 최대화
public class expMax {
    public static long calculate(long y,long x,String d) {
    	if(d.compareTo("+")==0) return x+y;
    	else if(d.compareTo("-")==0) return x-y;
        return x*y;
    }
    
    public static int getExp(String d,int idx) {
        String[][] ex = {
            { "", "-" , "+" , "*" },
            { "", "-" , "*" , "+" },
            { "", "*" , "+" , "-" },
            { "", "*" , "-" , "+" },
            { "", "+" , "-" , "*" },
            { "", "+" , "*" , "-" }
        };

        for(int i=0;i<ex[idx].length;i++) {
            if(d.compareTo(ex[idx][i])==0 ) return i;
        }
        return 0;
    }
    
    public long solution(String expression) {
        long answer = 0;
        String[] numtmp = expression.split("(?<=[*+-])|(?=[*+-])");       
        
        for(int index=0;index<6;index++) {
            List<String> stringList = new ArrayList<String>();        
            Stack<String> stack = new Stack<>();        
            for(String d:numtmp) {
                int x = getExp(d,index);
                if(x == 0) {
                    stringList.add(d);
                }
                else {
                    while(true) {
                        if(stack.size()==0) break;
                        int tmp = getExp(stack.peek(),index);
                        if(tmp >= x) {
                            stringList.add(stack.pop());
                        }
                        else 
                            break;
                    }
                    stack.push(d);
                }
            }

            while(true) {
                if(stack.size() == 0) break;
                stringList.add(stack.pop());
            }

            Stack<Long> finExp = new Stack<>();
            for(int i=0;i<stringList.size();i++) {
                String tmp = stringList.get(i);
                if(getExp(tmp,index) == 0) finExp.push(Long.parseLong(tmp));
                else {                  
                    finExp.push(calculate(finExp.pop(),finExp.pop(),tmp));
                }
            }

            long sum = Math.abs(finExp.pop());
            answer = answer<sum?sum:answer;

        }
        
        return answer;
    }
}
