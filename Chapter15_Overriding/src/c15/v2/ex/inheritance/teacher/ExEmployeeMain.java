package c15.v2.ex.inheritance.teacher;
/*
 다음을 만족하는 클래스 Employee를 작성하시오. 

- 클래스 Employee(직원)은 
 //클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
- 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
- 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력

=======================================

다음을 만족하는 클래스 Regular를 작성하시오. 

- 클래스 Regular는 위에서 구현된 클래스 Employee의 하위 클래스
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
- Setter : 월급 정보 필드를 지정
- 메소드 printInfo() : 인자는 없고 기본적인 이름, 나이, 주소, 부서 를 출력후
 "정규직  월급" 이라는 이름으로 월급출력
-상위 클래스에서 접근제한자 수정이 필요 하면 수정 할것.
 */
public class ExEmployeeMain {

	public static void main(String[] args) {
		
		Employee ep = new Employee("홍길동",30,"New York", "rnd1");
		
		Regular re = new Regular("동해번",14,"seoul2", "rnd2");
		// 주의 : 문제에서 "Setter : 월급 정보 필드를 지정" 라고 나왔으므로,
		re.setSallary(200);
		
		ep.printInfo();
		System.out.println();
		re.printInfo();
	}
}

class Employee{
	private String name;
	private int age;
	private String address;
	private String depart;
	// 주의 : 문제에서 , "상위 클래스에서 접근제한자 수정이 필요 하면 수정 할것" 이라고 나왔으므로
	protected int salary;
	
	Employee(String name,int age, String address,String depart){
		this.name  = name;		
		this.age  = age;
		this.address  = address;
		this.depart  = depart;
	}
	
	void printInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("주소:" + address);
		System.out.println("부서:" + depart);
		
	}
}

class Regular extends Employee{
	// 주의 :  문제에서 "생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출"  라고 되어있었으므로, 파리메터 갯수는 4개를 사용해서 만들기
	Regular(String name,int age, String address,String depart){
		super(name, age, address, depart);
	}
	// 주의 : 문제에서 "Setter : 월급 정보 필드를 지정" 이라고 되어있었으므로,--> setter를 만들라는 이야기?!
	void setSallary(int salary) {
		super.salary = salary;
	}
	
	void printInfo() {
		// 주의 : 부모것을 사용하고, 프린트 하기
		super.printInfo();
		System.out.println("정규직 월급:" + super.salary);
	}
	
}

class Temporary extends Employee{
	Temporary(String name,int age, String address,String depart){
		super(name, age, address, depart);
	}
	void setSallary(int salary) {
		super.salary = salary;
	}
	void printInfo() {
		// 주의 : 부모것을 사용하고, 프린트 하기
		super.printInfo();
		System.out.println("비정규직 월급 " + super.salary);
	}
	
}


