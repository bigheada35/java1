package CTodayTest;

class Money {
	
	private int money;
	
	Money(int money){
		setMoney(money);
	}
	void setMoney(int money) {
		if(money<= 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		this.money = money;
	}

	void show() {
		int rem = money;
		
		System.out.println("오만원"+ rem/50_000 +"장");
		rem = rem % 50_000;
		
		System.out.println("만원"+ rem/10_000 +"장");
		rem = rem % 10_000;
		
		System.out.println("천원"+ rem/1_000 +"장");
		rem = rem % 1_000;
		
		System.out.println("오백원"+ rem/500 +"장");
		rem = rem % 500;
		
		System.out.println("오백원"+ rem/100 +"장");
		rem = rem % 100;		
	}
	
}
