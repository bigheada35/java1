package r_today_test5;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Test5 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		Set<Integer> set = map.keySet();
		for( Iterator<Integer> it = set.iterator(); it.hasNext(); ) {
			Integer i = it.next();
			System.out.println(i + ", " + map.get(i));
		}
		
	}
}




/*
TreeMap의 전체 Value 값을 확인 하기 위한 소스를 짜시오.

*/