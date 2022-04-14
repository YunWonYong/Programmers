package boj.rotateQueue;

import java.util.*;
import java.lang.*;
import java.io.*;

// 백준, 1021, 회전하는 큐
public class Main
{
    int n,m;
    int[] arrm;
    List<Integer> list = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();

    public void input_data() {
		Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arrm = new int[m];
        
        for(int i=0;i<n;i++) 
        	list2.add(i+1);
        
        for(int i=0;i<m;i++)
        	list.add(scan.nextInt());
        
        scan.close();
    }
    
    public int process() {
    	int move = 0, idx=0;
		for(int i=0;i<list.size();i++) {
			int fidx = list2.indexOf(list.get(i));
			int len = Math.abs(fidx - idx);
			if(list2.size()/2 < len) len = list2.size() - len;
			list2.remove(fidx);
			idx = fidx;
			move += len;
		}
    	return move;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Main solution = new Main();
		solution.input_data();
        System.out.println(solution.process());
	}
}