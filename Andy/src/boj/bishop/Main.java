package boj.bishop;


import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

//백준, 1560, 비숍
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));     
	    String str = reader.readLine();
		BigInteger bi = new BigInteger(str);
		if(bi.compareTo(BigInteger.ONE) == 0) {
			System.out.println(1);
			return;
		}
		BigInteger two = new BigInteger("2"); 
		bi = bi.multiply(two).subtract(two);
		System.out.println(bi.toString());
		
	}
}