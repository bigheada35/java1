package Bank;

public class BankAccount02_Constructor {
	
	public static void main(String[] args) {

		BankAccount yoon = new BankAccount();
		//BankAccount park = new BankAccount("1234","2012-1013", 1);
		BankAccount park = new BankAccount("12-34-57", "99090-9090991", 101);
		BankAccount choi = new BankAccount();
		
		yoon.checkMyBalance();
		park.checkMyBalance();
		
		yoon.setName("윤김나");
		park.setName("박김나");

	}

}
