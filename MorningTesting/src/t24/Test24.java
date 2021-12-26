package t24;

import java.util.Scanner;

public class Test24 {
	public static void main(String[] args) {
		
		Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
		employee.printInfo();
	}

}
class Employee{
	private String name, adress, depart;
	private Integer age;

	public Employee(String name, Integer age, String adress, String depart) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.depart = depart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("주소 : " + getAdress());
		System.out.println("부서 : " + getDepart());
	}
	
}

/*
Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
employee.printInfo();

출력:
이름 : 홍길동
나이 : 19
주소 : 서울 뉴욕시
부서 : 개발 1팀
*/