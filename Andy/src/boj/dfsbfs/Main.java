package boj.dfsbfs;


import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

//백준, 1260, DFS와 BFS
class Main
{
	public int m,n,start;
	public int [][] tree;
	
	public int []arr;
	
	public void rec(int cur) {
		if(arr[cur] == 1) return;
		arr[cur] = 1;
		System.out.print(cur + " ");
		
		for(int i=1;i<=m;i++) {
			if(tree[cur][i] > 0) rec(i);
		}
	}

	public void dfs() {
		arr = new int[m+1];
		rec(start);
        System.out.println("");
	}
	
	public void bfs() {
		arr = new int[m+1];
		List<Integer> buf = new ArrayList<Integer>();
		buf.add(start);
		arr[start] = 1;
		System.out.print(start + " ");
		
		while(true) {
			List<Integer> tmp = new ArrayList<Integer>();
			for(int i=0;i<buf.size();i++) {
				int d = buf.get(i);
				for(int d2=1;d2<=m;d2++) {
					if(tree[d][d2]>0 && arr[d2] == 0) {
						arr[d2] = 1;
						System.out.print(d2 + " ");
						tmp.add(d2);
					}
				}
			}
			if(tmp.size() == 0) break;
			buf = tmp;
		}
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Main main = new Main();		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));     
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    StringTokenizer st = new StringTokenizer(reader.readLine());
	    main.m = Integer.parseInt(st.nextToken());
	    main.n= Integer.parseInt(st.nextToken());
	    main.start = Integer.parseInt(st.nextToken());
	    
	    main.tree = new int[main.m+1][main.m+1];	    
	   	    
	    for(int i=0;i<main.n;i++) {
		    st = new StringTokenizer(reader.readLine());
		    int x = Integer.parseInt(st.nextToken());
		    int y = Integer.parseInt(st.nextToken());
	    	
		    main.tree[x][y] = 1;
		    main.tree[y][x] = 1;
	    }
	    
		main.dfs();
		main.bfs();
	    
	}
}