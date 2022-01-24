package level1;

import java.util.ArrayList;
import java.util.List;

public class GCDandLCM {
	// 소인수분해해서 구하기
	public int[] solution(int n, int m) {
		int[] answer = new int[] {1,1};
		List<Integer> nlist = factorize2(n);
		List<Integer> mlist = factorize2(m);
		
		int pointer = 0;
		int nValue = 0;
		int mValue = 0;
		
		for(int i=0; i<nlist.size(); i++) {
			nValue = nlist.get(i);
			for(int j=pointer; j<mlist.size(); j++) {
				mValue = mlist.get(j);
				
				if(nValue == mValue) {
					answer[0] *= nValue;
					pointer = ++j;
					break;
				}
			}
		}
		
		answer[1] = (n*m)/answer[0];
		
		return answer;
	}
	
	// 소인수 분해하기
	public List<Integer> factorize(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int divisor = 2;
		
		while(n!=1) {
			if(n%divisor == 0) {
				list.add(divisor);
				n /= divisor;
			}else {
				divisor++;
			}
		}
		
		return list;
	}
	
	// 소인수 분해하기 2(약수가 2인 경우 분리)
	public List<Integer> factorize2(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int divisor = 2;
		
		while(divisor == 2) {
			if(n%divisor == 0) {
				list.add(divisor);
				n /= divisor;
			}else {
				divisor++;
			}
		}
		
		while(n!=1) {
			if(n%divisor == 0) {
				list.add(divisor);
				n /= divisor;
			}else {
				divisor +=2;
			}
		}
		
		return list;
	}
}
