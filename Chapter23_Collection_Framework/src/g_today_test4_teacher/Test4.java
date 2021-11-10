package g_today_test4_teacher;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test4 {

	public static void main(String[] args) {
		final int STU_NUM = 4;
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> arrList = new ArrayList<>();
		for(int i=0; i< STU_NUM; i++) {
			System.out.println(">> ");
			
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			
		
			String name = st.nextToken().trim();
			String dept = st.nextToken().trim();
			String number = st.nextToken().trim();
			double grade = Double.valueOf(st.nextToken().trim());
			
			arrList.add(new Student(name, dept, number, grade));
		}
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.print("-----------------------");
			Student student = arrList.get(i);
			
	        System.out.println("이름: "+student.getName());
	        System.out.println("학과: "+student.getDept());
	        System.out.println("학번: "+student.getNumber());
	        System.out.println("학점평균: "+student.getGrade());

		}
		System.out.print("-----------------------");
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			if(name.equals("그만"))
	            break;

			// 찾기	
			for (int i = 0; i < arrList.size(); i++) {
				Student s = arrList.get(i);
				s.findStudent(name);
			}

			

		}
		System.out.println("종료");
		
		
	}

}

class Student{
	private String name;
	private String dept;
	private String number;
	private double grade;
	
	
	public Student(String name, String dept, String number, double grade) {
		super();
		this.name = name;
		this.dept = dept;
		this.number = number;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public void findStudent(String name) {
		if(this.name.equals(name)) {
			System.out.println(this.name +", " + this.dept +", " + this.number +", " + this.grade);
		}
	}
	
}



/*

학생마다 Student 객체를 생성하고
4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에
ArrayList<Student>의 모든 학생(4명) 정보를 출력하고 
학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라

*/