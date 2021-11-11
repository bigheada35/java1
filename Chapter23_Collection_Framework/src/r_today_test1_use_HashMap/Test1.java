package r_today_test1_use_HashMap;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		Manager mg = new Manager();
		mg.inputStudentInfo();
		mg.StudentInfoAll();
		mg.findStudentInfo();
	}

}

class Student{
	private String name;
	private String maj;
	private String snum;
	private String average;
	
	Student(String name, String maj, String snum, String avg){
		this.name = name;
		this.maj = maj;
		this.snum = snum;
		this.average = avg;
	}
	
	@Override
	public String toString() {
		String str = "----------------------------------\n\n";
		str += "이름: " + this.name + "\n\n";
		str += "학과: " + this.maj + "\n\n";
		str += "학번: " + this.snum + "\n\n";
		str += "학점평균: " + this.average + "\n\n";
		return (str);
	}
	String getName() {
		return this.name;
	}
	String getInfo() {
		String str = "----------------------------------\n\n";
		str += "이름: " + this.name + "\n\n";
		str += "학과: " + this.maj + "\n\n";
		str += "학번: " + this.snum + "\n\n";
		str += "학점평균: " + this.average + "\n\n";
		return (str);
	}
	String getInfo2() {
		String str = this.name + ", ";
		str += this.maj + ", ";
		str += this.snum + ", ";
		str += this.average + "\n";
		return (str);
	}
}

class Manager {
	private final int INFO_CNT=4;
	
	//private final int STUDENT_CNT= 2;
	private final int STUDENT_CNT= 4;

	private List<Student> list = null;
	
	private HashMap<String, Student> listMap = null;//sj
	
	private String[] arryStr = null;
	
	Manager(){
		list = new ArrayList<>();
		
		listMap = new HashMap<>();//sj - add
		
		arryStr = new String[INFO_CNT];
	}
	void input() {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.print(">> ");
			for(int i=0; i<INFO_CNT ; i++) {
				String str = sc.next();
				int idx_comma = str.indexOf(',');
				if(idx_comma >= 0) {
					String subStr = (String)str.subSequence(0, str.indexOf(','));
					arryStr[i] = subStr;
				}else {
					arryStr[i] = str;
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
			System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
			input();
		}

	}
	void inputStudentInfo(){
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i=0; i < STUDENT_CNT; i++) {
			input();
			
			list.add(new Student(arryStr[0], arryStr[1], arryStr[2], arryStr[3]));
			
			String name = arryStr[0];//sj
			listMap.put(name, new Student(arryStr[0], arryStr[1], arryStr[2], arryStr[3]));//sj - add
		}
	}

	void StudentInfoAll() {
		for (Student stu : list) {
			//sj - 0
			//System.out.println(stu.getInfo());
		}
		
		//sj - add
		Set<String> set = listMap.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String stuname = iter.next();
			System.out.println(stuname + ": " + listMap.get(stuname));
		}
		
		System.out.println("----------------------------------\n\n");
	}
	void findStudentInfo() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			System.out.println();
			
			for (Student stu : list) {
				if(stu.getName().equals(name)) {
					//sj - 0
					//System.out.println(stu.getInfo2());
				}
			}
			
			//sj - add
			Set<String> set = listMap.keySet();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()) {
				String stuname = iter.next();
				if(stuname.equals(name)) {
					
					System.out.println(listMap.get(stuname).getInfo2());
				}
			}
			
			
			
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}


/*

학생마다 Student 객체를 생성하고
4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에
ArrayList<Student>의 모든 학생(4명) 정보를 출력하고 
학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라

*/