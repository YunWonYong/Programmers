class Solution {
    public String solution(int n) {
        StringBuffer sb = new StringBuffer();
        
        while (n > 0) {
            int r = n % 3;
            if (r == 0) {
                n--;
                sb.append(4);
            } else {
                sb.append(r);
            }
            n /= 3;
        }
        
        return sb.reverse().toString();
    }
}