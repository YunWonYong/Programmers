package ywy.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		int num = 0;
		long start = System.currentTimeMillis();
		while(true) {
			set.add(num);
			if (set.size() == 100000) {
				break;
			}
			num++;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		start = System.currentTimeMillis();
		num = 0;
		while(true) {
			list.add(num);
			if (list.size() == 100000) {
				break;
			}
			num++;
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
