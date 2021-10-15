package Bank;

public class BankAccount01_Init {
	
	
	//public static void printNum(int num) {
	public static void printNum(BankAccount person) {
	//public void printNum(BankAccount person) {
		
		if(person == null)
			return;
		
		int num = person.checkMyBalance();
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {

		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
//		yoon.deposit(5000);
//		park.deposit(3000);
//		
//		yoon.withdraw(2000);
//		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
		
		//printNum(yoon);
		
//		//----test String ---
//		System.out.println("yoon:"+yoon.getName());
//		System.out.println("park:"+park.getName());
		yoon.setName("윤김나");
		park.setName("박김나");
//		System.out.println("yoon:"+yoon.getName());
//		System.out.println("park:"+park.getName());
		
//--test init		
		yoon.initAccount("12-34-56", "99090-9090990", 10000);
		park.initAccount("12-34-57", "99090-9090991", 10001);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
//--test 		
		System.out.println("---test1---");
		yoon.checkAll();
		System.out.println("---test2---");
		park.checkAll();
		
//--test static 필드
		System.out.println("--1--");
		System.out.println("-클래스직접접근--" + BankAccount.balance2);
		BankAccount.balance2 = 2;
		//System.out.println("BankAccount:"+ BankAccount);
//--test static 필드		
		System.out.println("--2--");
		System.out.println("yoon getBal2: "+ yoon.getBal2());
		yoon.setBal2(201);
		System.out.println("yoon getBal2: "+ yoon.getBal2());
		System.out.println("--3--");
		System.out.println("park getBal2: "+ park.getBal2());
		park.setBal2(202);
		System.out.println("park getBal2: "+ park.getBal2());
	}

}
