package EMornnigTest;

class Employee{
	//
	// private 꼭 붙이자.
	private String name;
	private int age;
	private String address;
	private String team;
	
	Employee(String name, int age, String address, String team){
		setName(name);
		setAge(age);
		setAddress(address);
		setTeam(team);
	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		if(age<= 0)
			return;
		this.age = age;
	}

	void setAddress(String address) {
		this.address = address;
	}

	void setTeam(String team) {
		this.team = team;
	}
	
	void printInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("부서 : " + team);
	}
	
}





public class EmployeeTest {
	

	public static void main(String[] args) {
	
/*
Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
employee.printInfo();

출력:
이름 : 홍길동
나이 : 19
주소 : 서울 뉴욕시
부서 : 개발 1팀
 * 
 */
		Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
		employee.printInfo();

		
	}

}
