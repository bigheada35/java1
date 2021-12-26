package temp_05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Money { 
	private int money;
	
	Money(int money) {
		
		if( money <= 0) {
			money = 0;
			System.out.println("잘못된 입력입니다.");
			return;
		}
		this.money = money;
	}

	void show(){
		int rem = money;
			
		System.out.print(rem + " = ");
		
		System.out.print("5만원" + rem/50_000 + "장" );
		rem = rem % 50_000;
		
		System.out.print("+ 만원" + rem/10_000 + "장" );
		rem = rem % 10_000;
		
		System.out.print("+ 오천원" + rem/5_000 + "장" );
		rem = rem % 5_000;
		
		System.out.print("+ 천원" + rem/1_000 + "장" );
		rem = rem % 1_000;

		System.out.print("+ 오백원" + rem/500 + "개" );
		rem = rem % 500;
		
		System.out.print("+ 백원" + rem/100 + "개" );
	}
}

public class Test5 {
	public static void main(String[] args) {
		Money money = new Money(-126000);
		money.show();
	}
		
}
 
