package level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * 소수 찾기 (211224 - 211230)
 */

public class SearchPrimeNumber {
	// 자료구조 이용 X
	public int solution(int n) {
		int count = 1;
		for(int i=3; i<=n; i+=2) {
			System.out.println(i);
			if(isPrimeNumber(i)) count ++;
			
			System.out.println("count:" + count);
		}	
		return count;
	}
	
	public static void main(String[] args) {
		SearchPrimeNumber sp = new SearchPrimeNumber();
		sp.solution(100);
	}
	
	public boolean isPrimeNumber(int n) {
		if(n == 2) return true;
		for(int i=3; i<=Math.sqrt(n); i+=2) {
            if(n%i == 0) {
                return false;
            }
        }
		return true;
	}
	
	// 효율성 테스트에서 탈락. Solution3보단 개선 되었다.
	public int solution2(int n) {
		Set<Integer> hSet = new HashSet<Integer>();
		for(int i=3; i<=n; i+=2) {
			hSet.add(i);
		}
        hSet.removeIf(v->{
            for(int i=3; i<=Math.sqrt(v); i+=2) {
                if(v%i == 0) {
                    return true;
                }
            }
            return false;
        });

		hSet.add(2);
		return hSet.size();
	}
	
	public int solution3(int n) {
		// 효율성 테스트에서 탈락
		List<Integer> list = new ArrayList<Integer>();

		list.add(2);
		for(int i=3; i<=n; i+=2) {
			list.add(i);
		}
		
		for(int j=0; j<list.size(); j++) {
			int curr = list.get(j);
			int divider;
			boolean check = true;
					
			for(int k=0; k<j; k++) {
				divider = list.get(k);
				
				if(curr % divider == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				list.removeIf(i -> (i > curr) && (i % curr == 0));
			}
		}
		
        return list.size();
    }
}
