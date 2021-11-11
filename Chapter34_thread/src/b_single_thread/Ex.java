package b_single_thread;

import javax.swing.JOptionPane;

public class Ex {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		for(int i = 10; i> 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {

			}
			
		}

	}

}

class ThreadTest{

}

class MyThread1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
	}	
}
class MyThread2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
	}	
}