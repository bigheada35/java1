package ch23_p15;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Ex {
    public static void main(String[] args) {
    	// 기본 자료형 데이터의 저장과 참조
    	
    	LinkedList<Integer> list = new LinkedList<>();
    	list.add(10);//저장 과정에서 오토 박싱 진행
    	list.add(20);
    	list.add(30);
    	
    	// 오토 박싱과 오토 언박싱 덕분에  컬렉션 인스턴스에 
    	// 기본 자료형의 값도 저장 가능하다.
    	int n;
    	for(Iterator<Integer> itr = list.iterator(); itr.hasNext();  ) {
    		n= itr.next(); //오토 언박싱 진행 
    		System.out.println(n + "\t");
    	}
        
    	System.out.println();
        
    }
}
