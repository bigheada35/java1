package temp_01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Grade{
	private int kor,eng,mat;
	private double tot,avg;

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	public double getTot() {
		tot = kor + eng + mat; 
		return tot;
	}
	public double getAvg() {
		avg = (kor + eng + mat)/(double)3; 
		return avg;
	}

	public Grade(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		testGrade();
	}
	public static void testGrade() {
		System.out.println("국영수 점수를 입력 하세요");
		Scanner sc = new Scanner(System.in);
		int kor=0,eng=0,mat=0;
		
		try {
			 kor = sc.nextInt();
			 eng = sc.nextInt();
			 mat = sc.nextInt();
					
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
			testGrade();
		}
		
		Grade gr = new Grade(kor,eng,mat);
		System.out.println("총점" + gr.getTot());
		System.out.println("평균" + gr.getAvg());
	}
}
 


