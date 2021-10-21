
public class A1MyBusinessMan {

	public static void main(String[] args) {
		
		//Man ma = new Man("ssj");
		//ma.tellYourName();
		BusinessMan bma = new BusinessMan("ssj", "sk", "rnd");
		bma.tellYourInfo();
		
	}

}


class Man{
	String name;
	
	//test : use  =>  res : err
	Man(String name){
		this.name = name;
	}
	
	//test : use => res : err
	//Man(String name, String company,String position){
	//}
	
	public void tellYourName() {
		System.out.println("My name is "+ name);
	}
}

class BusinessMan extends Man{
	String company;
	String position;
	
	//super(); 부모 생성자 호출
	//this(); 생성자 호출
	
	BusinessMan(String name, String company,String position) {
		//
		// 부모것은 this 대신에 super를 붙이기 (this 사용도 OK )
		//
		//this.name = name;
		//super.name = name;
		
		//
		// 부모의 생성자를 호출
		//
		super(name);
		
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		//
		//  OK
		tellYourName();
		// 	OK - 권장
		super.tellYourName();
	}
	
}