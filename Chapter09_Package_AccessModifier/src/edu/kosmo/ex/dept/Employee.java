package edu.kosmo.ex.dept;

public class Employee {
		//
		//private 꼭 붙이자.
		//
		private String name;
		private int age;
		private String address;
		private String dept;

		public Employee(String name, int age, String address, String dept) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.dept = dept;
		}
		//
		//  메소드 함수는 꼭 public 붙여서 쓰기
		//
		public void printInfo() {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("주소 : " + address);
			System.out.println("부서 : " + dept);
		}
}
