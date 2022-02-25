class Solution {
    public long solution(int w, int h) {
        if (w == h) 
            return (long)w * h - w;
        
        int temp;
        if (h > w) {
            temp = w;
            w = h;
            h = temp;
        }
        
        int gcd = gcd(w,h);

        double unit = 0;
        double unitH = (double) h / gcd;
        for (double k = 1; k <= unitH; k++) {
            unit += (Math.ceil(k * w / h) - Math.floor((k - 1) * w / h));
        }

        return (long) w * h - (long) unit * gcd;
    }
    
    public int gcd(int w, int h) {
        int r;
        
        while (h > 0) {
            r = w % h;
            w = h;
            h = r;
        }
        
        return w;    
    }
}