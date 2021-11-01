package j_today_test6_3_teacher;


/*

아래를 프로그래밍 하시오.
- 클래스 Person
* 필드 : 이름, 나이, 주소 선언
- 클래스 Student
* 필드 : 학교명, 학과, 학번, 8개 평균평점을 저장할 배열로 선언
* 생성자 : 학교명, 학과, 학번 지정
* 메소드 average() : 8개 학기 평균평점의 평균을 반환
- 클래스 Person과 Student 
- 프로그램 테스트 프로그램의 결과 : 8개 학기의 평균평점은 표준입력으로 받도록한다.

이름 : 김다정
나이 : 20

주소 : 서울시 관악구
학교 : 동양서울대학교
학과 : 전산정보학과
학번 : 20132222
----------------------------------------

8학기 학점을 순서대로 입력하세요

1학기 학점  → 3.37
2학기 학점  → 3.89
3학기 학점  → 4.35
4학기 학점  → 3.76
5학기 학점  → 3.89
6학기 학점  → 4.26
7학기 학점  → 4.89
8학기 학점  → 3.89

----------------------------------------

8학기 총 평균 평점은 4.0375점입니다.

 */

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	private String address;	
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void print() {
		System.out.println("이름" + getName());
		System.out.println("나이" + getAge());
		System.out.println("주소" + getAddress());		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	
}
//학교명, 학과, 학번, 8개 평균평점을 저장할 배열로 선언
class Student extends Person{
	private String uni;
	private String major;
	private int stuNum;
	
	private double[] grade = new double[8];
	

	public Student(String name, int age, String address,String uni, String major, int stuNum) {
		super(name,age,address);
		
		this.uni = uni;
		this.major = major;
		this.stuNum = stuNum;
	}

	public void print() {
		System.out.println("이름" + super.getName());
		System.out.println("나이" + super.getAge());
		System.out.println("주소" + super.getAddress());
		
		System.out.println("학교" + uni);
		System.out.println("학고" + major);
		System.out.println("학번" + stuNum);		
		
	}
	
	public double average() {
		double sum = 0;
		double avg = 0;
		
		for (double d : grade) {
			sum = sum + d;
		}
		avg = sum / grade.length;
		
		return avg;
		
	}
	
	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public double[] getGrade() {
		return grade;
	}

	public void setGrade(double[] grade) {
		this.grade = grade;
	}
	
	public void setGrade() {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("8학기 학점을 순서대로 입력하세요");
			
			for(int i=0;  i < grade.length; i++) {
				System.out.println((i+1)+ "학기 학점  →  " );
	            grade[i] = sc.nextDouble();
			}
		}
		catch (Exception e) {
			System.out.println("잘못된 입력입니다.다시 입력해 주세요");
			setGrade();		
		}
				
	}
		
}

//=======================
class Test6_3 {
    public static void main(String[] args) {
    	Student student = new Student("김다정", 20, "서울시 대치동", "한국대학교", "전산학과", 210098);
    	student.print();
    	
    	student.setGrade();
    	
    	System.out.println("8학기 총 평균 평점은" + student.average() +"점입니다.");
    	
    	
    }
}
