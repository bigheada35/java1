package ch23_p36_queue_from_linkedList;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Ex {
	
    public static void main(String[] args) {

    	Deque<String> deq = new ArrayDeque<>();
    	
    	   // 앞으로 넣고
    	   deq.offerFirst("1.Box");
    	   deq.offerFirst("2.Toy");
    	   deq.offerFirst("3.Robot");

    	// 앞에서 꺼내기
    	   System.out.println(deq.pollFirst());
    	   System.out.println(deq.pollFirst());
    	   System.out.println(deq.pollFirst());

/*
 결과:
 
	3.Robot
	2.Toy
	1.Box
     
 */
        
    }

    
}
