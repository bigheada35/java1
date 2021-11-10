package r_today_test6;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test6 {

	public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
        tr.add(30);
        tr.add(10);    
        tr.add(20);        
        System.out.println(tr);
        
        for(Iterator<Integer> it = tr.iterator();  it.hasNext() ;  ) {
        	Integer i = it.next();
        	
        }
	}
}

class IntegerComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer a, Integer b) {
		//return a - b;
		return b - a;
	}
}

// 결과 : [30, 20, 10]


/*
아래의 IntegerComparator를 내림차순 정렬이 되게끔 구현하시오.

*/