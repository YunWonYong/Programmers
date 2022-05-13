package boj.hco;

import java.util.*;
import java.lang.*;
import java.io.*;

//백준, 2257, 화학식량
class Main
{
	public String orig;
	public int idx = -1;
    
    public char getChar(int i) {
        if(i>=orig.length()) return ' ';
        return orig.charAt(i);
    }
	
	public int getWeight() {
		
		int sum = 0;
		char ch = getChar(idx);
		if(ch == 'H') sum+=1;
		else if(ch == 'C') sum+=12;
		else if(ch == 'O') sum+=16;
		else 
			return 0;
			
		char ch2 = getChar(idx+1);
		
		if(ch2 >= '0' && ch2 <='9') {
			sum *= (ch2-'0');
		}
		return sum;
	}
	
	public int proc() {
		int sum = 0;
		while(true) {
			idx++;
			if(idx>=orig.length()) break;
			sum += getWeight();
			char ch = getChar(idx);
			if(ch == '(') 
				sum += proc();
			else if(ch == ')') {                
				char ch2 = getChar(idx+1);
				if(ch2>='0' && ch2<='9') {
					sum *= (ch2-'0');
					idx++;
				}
				return sum;
			}
		}
		return sum;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Main main = new Main();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));     
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = reader.readLine();
		main.orig = s;
		
		int ret = main.proc();
		System.out.println(ret);	
	}
}