package c15.v2.ex.inheritance;

public class ExEmployeeMain {

	public static void main(String[] args) {
		
		Employee ep = new Employee("홍길동",30,"New York", "rnd1");
		// 여기서 넣으라는 말이 없었으므로 사용 금지.
		//ep.setSallary(100);
		
		Regular re = new Regular("동해번",14,"seoul2", "rnd2");
		re.setSallary(200);
		
		
		ep.printInfo();
		re.printInfo();
	}
}

class Employee{
	private String name;
	private int age;
	private String address;
	private String depart;
	protected int sallary;
	
	Employee(String name,int age, String address,String depart){
		this.name  = name;		
		this.age  = age;
		this.address  = address;
		this.depart  = depart;
	}
	
//	public String getName() {
//		return name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public String getDepart() {
//		return depart;
//	}
//
//	int getSallary() {
//		return sallary;
//	}
//
//	void setSallary(int sallary) {
//		this.sallary = sallary;
//	}

	void printInfo() {
		System.out.println("이름:" + name + ", 나이:" + age + ", 주소:" + address + ", 부서:" + depart);
	}
}

class Regular extends Employee{
	Regular(String name,int age, String address,String depart){
		super(name, age, address, depart);
	}
	void setSallary(int sallary) {
		
		//super.setSallary(sallary);
		
		//
		// protected int sallary;  이므로, 아래와 같이 사용하는 방향으로
		// 
		super.sallary = sallary;
	}
	
	void printInfo() {
		//이렇게 하지 말고,  , Employee에 getter, setter만들으라는 얘기가 없었으므로
//		
//		System.out.println("이름:" + super.getName() + ", 나이:" + super.getAge() + ", 주소:" 
//				+ super.getAddress() + ", 부서:" + super.getDepart() + ", 정규직월급:" + super.getSallary());
		
		
		super.printInfo();
		System.out.println("정규직 월급 " + super.sallary);
	}
	
}

class Temporary extends Employee{
	Temporary(String name,int age, String address,String depart){
		super(name, age, address, depart);
	}
	void setSallary(int sallary) {
		super.sallary = sallary;
	}
	void printInfo() {
//		System.out.println("이름:" + super.getName() + ", 나이:" + super.getAge() + ", 주소:" 
//				+ super.getAddress() + ", 부서:" + super.getDepart() + ", 비정규직월급:" + super.getSallary());
		super.printInfo();
		System.out.println("비정규직 월급 " + super.sallary);
	}
	
}


