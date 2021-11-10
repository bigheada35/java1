package ch23_p42_map_use_set_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Ex {
	
    public static void main(String[] args) {
    	HashMap<Integer, String> map = new HashMap<>();
   
        // Key-Value 기반 데이터 저장
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");
      
        //
        //	Map 안의  Set
        //
        // Key만 담고 있는 컬렉션 인스턴스 생성
        Set<Integer> ks = map.keySet();
        
        // 전체 Key 출력 (for-each문 기반)
        for(Integer n : ks)
            System.out.print(n.toString() + '\t');
        System.out.println();
        
        // 전체 Value 출력 (for-each문 기반)
        for(Integer n : ks)
            System.out.print(map.get(n).toString() + '\t');
        System.out.println();
        
        System.out.println("-------------");
        //
        //	Set 안의 iterator 
        //
        // 전체 Value 출력 (반복자 기반)
        for(Iterator<Integer> itr = ks.iterator(); itr.hasNext(); )
            System.out.print(map.get(itr.next()) + '\t');
        System.out.println();
/*
 결과:

	37	23	45	
	James	Martin	Brown	
	-------------
	James	Martin	Brown	
     
 */
        
    }

    
}
