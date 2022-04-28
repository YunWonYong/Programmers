package boj.editor;

import java.util.*;
import java.io.*;

//백준, 1406, 에디터
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList<Character> list = new LinkedList<Character>();        
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));     
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    String str = reader.readLine();
	    
	    StringTokenizer st = new StringTokenizer(reader.readLine());
	    int cnt = Integer.parseInt(st.nextToken());
	    int len = str.length();

	    for(int i=0;i<str.length();i++) {
	    	list.add(str.charAt(i));
	    }

        ListIterator<Character> pos = list.listIterator(len);  
        
	    for(int i=0;i<cnt;i++) {
	    	String p = reader.readLine();
            char c = p.charAt(0);
			
            switch(c) {
                case 'L':
                	if(pos.hasPrevious()) pos.previous();
                    break;
                case 'D':
                	if(pos.hasNext()) pos.next();
                    break;
                case 'B':
                	if(pos.hasPrevious()) {
                		pos.previous();
                		pos.remove();
                	}
                    break;
                case 'P':
                	pos.add(p.charAt(2));
                    break;
            }	    	
	    }
		
		for(Character i : list) { 
			bw.write(i);
		}
		bw.flush();
		bw.close();
	}
}