package ATest;

//public class Money { //다른 패키지 에서도 여길 접근 가능
class Money { //ATest패키지 내에서만 여길 접근 가능 함

	//	꼭 private으로	  
	private int money;//꼭 private으로 
	
	Money(int money){ //ATest패키지 내에서만 여길 접근 가능 함
		
		setMoney(money); //권장: Setter함수를 만들어서, 호출하는 식으로 사용 바람.

	}
	
	public void setMoney(int money) {
		
		if( money <= 0) {
			money = 0;
			System.out.println("잘못된 입력입니다.");
			return;
		}
		this.money = money;
	}

	void show(){
		int rem = money;
		
		if(rem == 0) {
			//System.out.println("돈이없습니다.");
			//return;
		}
			
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
