package t_today_test9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Test9 {
	public static void main(String[] args) {
        ThreadCount threadCount = new ThreadCount();
        threadCount.start();
        
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
        System.out.println("입력하신 값은 " + input + "입니다.");
	}

}
class ThreadCount extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		for(int i = 10; i > 0 ; i--) {
			System.out.println(i);
		}
	}
}

