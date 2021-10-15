package BTest;

class Employee {
	//private 습관화 하기
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
		if(age <= 0) {
			System.out.println("age오류");
			this.age = 0;	
			return;
		}
		this.age = age;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void setTeam(String team) {
		this.team = team;
	}
	
	void printInfo() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("주소:" + address);
		System.out.println("부서:" + team);
	}
	
}
