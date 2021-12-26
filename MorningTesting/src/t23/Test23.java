package t23;

import java.util.Scanner;

public class Test23 {
	public static void main(String[] args) {
		Money money = new Money(-126800);
		money.show();
	}

}

class Money{
	private double money;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Money(double money) {
		super();
		this.money = money;
		//Scanner sc = new Scanner(System.in);
		//int input = sc.nextInt();
		if(money <= 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
	}
	public void show() {
		double remain = 0;
		//System.out.println(remain/50_000);
		System.out.println("오만원: " + remain/50_000 +"장");
		remain = remain%50_000;
		
		//System.out.println(remain/10_000);
		System.out.println("만원: " + remain/10_000+"장");
		remain = remain%10_000;
		
		//System.out.println(remain/5_000);
		System.out.println("오천원: " + remain/5_000+"장");
		remain = remain%5_000;
		
		//System.out.println(remain/1_000);
		System.out.println("천원: " + remain/1_000+"장");
		remain = remain%1_000;		
		
		//System.out.println(remain/500);
		System.out.println("오백원: " + remain/500+"장");
		remain = remain%500;
		
	}
}


/*

*/