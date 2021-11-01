package j_today_test6_2_better;

import java.util.Scanner;

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

public class Test6_2_better {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student("김다정", "20", "서울시 관악구", "동양서울대학교", "전산정보학과", "20132222" );
		
		System.out.println(student);
		System.out.println("8학기 학점을 순서대로 입력하세요");
		
		try {	
			//for(int i=0;i < 8; i++) {
			for(int i=0;i < student.getSemester().length; i++) {
				System.out.print((i+1) + "학기 학점 -> ");
				double score= scan.nextDouble();
				student.setScore(score);	
			}
			System.out.println("8학기 총 평균 평점은 " + student.Average() + "점입니다.");
		}catch(Exception e) {
			//System.out.println("다시 이력 해 주세요");

		}
	}
}

class Person{
	private String name, age, address;
	Person(String name, String age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return ("이름 : " + name + "\n" + "나이 : " + age + "\n"+"주소 : " + address + "\n");
	}
	void test() {
		System.out.println("--Person--");
	}
}

class Student extends Person{
	private String university, major, snum;
	private double[] semester = new double[8];
	private int i=0;
	Student(String name, String age, String address, String university, String major, String snum){
		super(name, age, address);
		this.university = university;
		this.major = major;
		this.snum = snum;
	}
	public double Average() {
		double sum = 0;
		for (double d : semester) {
			sum += d;
		}
		return (sum/(double)semester.length);
	}
	double[] getSemester(){
		return semester;
	}
	public void setScore(double semester) {
		this.semester[i++] = semester;
		if(i>= this.semester.length)
			i=0;
	}
	@Override
	public String toString() {
		return ( super.toString() +"학교 : " + university + "\n" + "학과 : " + major + "\n"+"학번 : " + snum + "\n");
	}

}

