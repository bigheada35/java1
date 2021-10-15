package CTest;

//import Bank.BankAccount;

public class Test2 {
	//출력 : 
	// LG에서 만든 2017년형 32인치 TV
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치
		myTV.show();
//		TV myTV2 = new TV("LG2", 2018, 33); // LG에서 만든 2017년 32인치
//		myTV2.show();
		
		TV yourTV = new TV("삼성", 2021, 70); // LG에서 만든 2017년 32인치
		yourTV.show();
		
		//System.out.println("-- 다른패키지에있는 BankAccount 생성자 호출 ");
		//BankAccount bcnt = new BankAccount();
	}

}
