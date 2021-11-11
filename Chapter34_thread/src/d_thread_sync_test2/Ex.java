package d_thread_sync_test2;

import javax.swing.JOptionPane;

public class Ex {

	public static void main(String[] args) {
		//Sync test
		
		//쓰레드 이름체크
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);
		
		Runnable r = new AccountThread();
		//Thread t1 = new Thread(r);
		Thread t1 = new Thread(r, "첫번째");
		//Thread t2 = new Thread(r);
		Thread t2 = new Thread(r, "두번째");// 쓰레드 이름
		
		t1.start();
		t2.start();

	}

}

class Account {
	int balance  = 200;
	// 주의 : synchronized 붙여야 한다.
	public void withdraw(int money) {
	  synchronized(this) {
		if(balance >= money) {
			// 주의 : 체크트라 반드시 try catch로 묶어야 한다.
			try {
				Thread.sleep(1000);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "빼기전:"+ balance);
			//
			// 주의: 이거는 효과가 없는데, 왜 일까??
			//
			//synchronized(this) {
				balance -= money;
			//}
			
			System.out.println(threadName + "뺀후:"+ balance);
		}
	  }
	}
}
// thread만드는 2가지 방법 중 - 2nd
class AccountThread implements Runnable{
	Account acc = new Account();
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + "::balance: " + acc.balance);
		
		while(acc.balance > 0 ) {
			int money = 200;
			acc.withdraw(money);
			//System.out.println("잔액"+ acc.balance);
			System.out.println(threadName + "잔액"+ acc.balance);
		}
	}
	
}
