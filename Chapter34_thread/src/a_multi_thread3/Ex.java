package a_multi_thread3;

import javax.swing.JOptionPane;

public class Ex {

	public static void main(String[] args) {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		for(int i = 0; i> 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {

			}
			
		}

	}

}
class ThreadEx7_1 extends Thread{
	public void run() {
		for(int i=10; i> 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
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