package level1;

/*
 * 수박수박수박수박수박수? (211231 - 220107) 
 */

public class SubakSubak {
	// 0.08ms - 0.96ms (StringBuffer)
	// 0.06ms - 0.84ms (StringBuilder)
	public String solution(int n) {
		StringBuffer sb = new StringBuffer(n);
		boolean bool = true;
		
		for(int i=0; i<n; i++) {
			if(bool == true) {
				sb.append("수");
				bool = false;
			}else {
				sb.append("박");
				bool = true;
			}
		}
		return sb.toString();
	}
	
	// 0.06ms 0 0.65ms (StringBuilder)
	public String solution1(int n) {
        StringBuilder sb = new StringBuilder(n);
        int division = n / 2;
        int remainder = n % 2;
        
        for(int i=0; i < division; i++) sb.append("수박");
        sb.append(remainder == 0? "" : "수");
        
        return sb.toString();
    }
}
