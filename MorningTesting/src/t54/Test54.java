package t54;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test54 {
	public static void main(String[] args) {

		ThreadCount threadCount = new ThreadCount();
		threadCount.start();
	}
}

class ThreadCount extends Thread{
	public void run() {
		for(int i = 10; i>0 ; i--) {
			try {
				Thread.sleep(1000);	
			} catch (Exception e) {
				
			}
			System.out.println(i);
		}			
	}
}

/*
        ThreadCount threadCount = new ThreadCount();
                threadCount.start();
                
                String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
                System.out.println("입력하신 값은 " + input + "입니다.");
10 9 8 7 6 ... 이 1초마다 실행 되도록 쓰레를 완성하시오.

*/
