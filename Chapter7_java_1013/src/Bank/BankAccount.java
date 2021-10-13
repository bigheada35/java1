package Bank;

public class BankAccount {
	//----------
	String name = "김났군";
	public BankAccount(){
		System.out.println("생성자 호출");
	}
	public BankAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;//계좌 개설시 예금액으로 초기화		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//----------
	String accNumber;//계좌번호
	String ssNumber;//주민번호
	int balance = 0;//예금잔액
	
	
	public int deposit(int amount) {
		this.balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}

	public void checkAll() {
		System.out.println("이름:"+name);
		System.out.println("계좌번호:"+accNumber);
		System.out.println("주민번호:"+ssNumber);
		System.out.println("잔액:"+balance);		
	}
	
	//초기화를 위한 메소드
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;//계좌 개설시 예금액으로 초기화		
	}

	//--- test static 필드 
	static int balance2 = 0;
	public void setBal2(int b) {
		balance2 = b;
	}
	public int getBal2() {
		return balance2;
	}

	
}
