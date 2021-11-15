package andy.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//프로그래머스 Level 1,실패율
class Node {
    public int no;
    public float fail;
    
    Node(int i,float f) {
        no = i;
        fail = f;
    }
}


class NodeCompare implements Comparator<Node> {
	
	public int compare(Node a, Node b) {
		if(a.fail < b.fail)
			return 1;
		else if(a.fail > b.fail)
			return -1;
		return 0;
	}
}


public class FailureLate {
    public int[] solution(int N, int[] stages) {
        List<Node> fail = new ArrayList<Node>();
        int cnt = stages.length;
        int[] answer = new int[N];
        int[] arr = new int[N+2];
        Arrays.fill(arr, 1);   
        for(int d:stages) arr[d]++;
        for(int i=1;i<=N;i++) {
            fail.add(new Node(i,arr[i]/cnt));
            cnt -= arr[i];
        }
        
        Collections.sort(fail, new NodeCompare());
        
        int i=0;
        for(Node d:fail) {
        	answer[i++] = d.no;
        }
        
        
        return answer;
    }
}
