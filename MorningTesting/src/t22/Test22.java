package t22;

import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {

		int math, science, english;
        math = 90;
        science = 80; 
        english = 80;

        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());
        System.out.println(me.getGrade()); //우 입니다.

		
	}

}

class Grade{
	private int math,sci,eng;
	private double avg;

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public Grade(int math, int sci, int eng) {
		super();
		this.math = math;
		this.sci = sci;
		this.eng = eng;
	}
	
	public double average() {
		this.avg = (math + sci + eng)/(double)3;
		return avg;
	}
	public String getGrade() {
		if(avg>=90) 
			return "수";
		else if(avg >= 80)
			return "우";
		else if(avg >= 70)
			return "미";
		else if(avg >= 60)
			return "양";
		else 
			return "가";
		
	}
	
}



/*

*/