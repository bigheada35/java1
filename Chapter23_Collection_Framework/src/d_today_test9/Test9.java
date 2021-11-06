package d_today_test9;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Test9 {
	
	public static void main(String[] args) {
		Manager mg = new Manager();
		mg.input();
		mg.find();
	}


}

class Student{
	private String name;
	private String major;
	private String snum;
	private double average;

	void set(List<String> o) {
		this.name = o.get(0);
		this.major = o.get(1);
		this.snum = o.get(2);
		this.average = Double.valueOf(o.get(3));
	}
	
	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public String getSnum() {
		return snum;
	}

	public double getAverage() {
		return average;
	}
	@Override
	public String toString() {
		String temp = "이름: " + name + "\n\n";
		temp += "학과: "+ major + "\n\n";
		temp += "학번: " + snum + "\n\n";
		temp += "학점평균: " + String.valueOf(average) + "\n";
		return (temp);
	}
	
}

class Manager{
	private final int CNT = 4;
	List<Student> listStudent = new ArrayList<>();
	List<String> listInput = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	void input() {
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		while(true){
			
			System.out.print("\n>> ");
			String in = sc.nextLine();
			StringTokenizer token = new StringTokenizer(in, ",");
			
			if(token.countTokens() != CNT) {
				System.out.println("잘못입력하였습니다.다시입력하세요");
				continue;
			}
			
			while (token.hasMoreTokens()) {
				listInput.add(token.nextToken());
			}
		
			Student student = new Student();
			student.set(listInput);
			listInput.clear();
			listStudent.add(student);
			
			if(listStudent.size() >= CNT)
				break;
		}
		System.out.println();
		for (Student student : listStudent) {
			System.out.println("----------------------------------\n");
			System.out.println(student);
		}
	}
	void find() {
		System.out.println("----------------------------------");
		while(true){
			
			System.out.print("\n학생 이름 >>");
			String in = sc.next();

			for (Student student : listStudent) {

				if(student.getName().equals(in)) {
					String info = "\n" + student.getName() + ", ";
					info += student.getMajor() + ", ";
					info += student.getSnum() + ", ";
					info += student.getAverage();
					System.out.println(info);
				}
				if(in.equals("그만"))
					return;
				
			}
		}
	}
}
