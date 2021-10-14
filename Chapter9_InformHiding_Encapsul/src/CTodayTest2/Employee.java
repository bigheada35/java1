package CTodayTest2;

class Employee {
	
	private String name;
	private int age;
	private String addr;
	private String team;
	
	Employee(String name, int age, String addr, String team){
		setName(name);
		setAge(age);
		setAddr(addr);
		setTeam(team);
	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		if(age <= 0) {
			System.out.println("-err-");
			return;
		}
		this.age = age;
	}

	void setAddr(String addr) {
		this.addr = addr;
	}

	void setTeam(String team) {
		this.team = team;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("부서 : " + team);
	}
	
}
