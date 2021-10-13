package Bank;

public class BankAccount00 {
	
	
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
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
		
		printNum(yoon);
		
		//----test String ---
		System.out.println("yoon:"+yoon.getName());
		System.out.println("park:"+park.getName());
		yoon.setName("윤김나");
		park.setName("박김나");
		System.out.println("yoon:"+yoon.getName());
		System.out.println("park:"+park.getName());		
	}

}
