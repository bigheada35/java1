

public class Grade {
	
	// private 처리 하기
	private int math, science, english;
	private double avg;
	
	Grade(int math, int science, int english){
		if(math <=0 ||  science<=0 || english<=0) {
			System.out.println("--err--");
			return;
		}
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double average() {
		avg =  (math + science + english)/3.0;
		return avg;
	}
	
	String getGrade() {
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
