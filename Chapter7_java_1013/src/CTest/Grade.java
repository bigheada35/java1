package CTest;

public class Grade {
	int math, science, english;
	double avg;
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double average() {
		avg =  (math + science + english)/3.0;
		return avg;
	}
	
	public String getGrade() {
		String str;
		
		if(avg >=90)
			str = "수 입니다";
		else if(avg >= 80)
			str =  "우 입니다";
		else if(avg >= 70)
			str =  "미 입니다";
		else if(avg >= 60)
			str =  "양 입니다";
		else
			str =  "가 입니다";	
		
		return str;
	}
	
}
