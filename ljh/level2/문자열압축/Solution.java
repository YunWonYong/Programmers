/**
 * 문자열 압축(220205-220211)
 */

class Solution {
    public int solution(String s) {
        int last = s.length()/2;
        int min = compact(s,1);
        int result = compact(s,1);;

        for(int i=2; i<=last; i++) {
            result = compact(s,i);
            if(result < min) {
                min = result;
            }
        }

        return min;
    }

    public int compact(String s, int sub) {
        StringBuffer sb = new StringBuffer(s);
        int length = s.length();
        int remainder = length%sub;
        int last = length-remainder-sub+1;

        String now = sb.substring(0,sub);
        String compare = "";
        int count = 1;

        for(int i=sub; i<last; i+=sub){
            compare = sb.substring(i,i+sub);

            if(now.equals(compare)){
                length -= sub;
                ++count;
            }else{
                if(count > 1) {
                    length += (int)(Math.log10(count)+1);
                }
                now = compare;
                count = 1;
            }
        }

        if(count > 1) {
            length += (int)(Math.log10(count)+1);
        }

        return length;
    }
}