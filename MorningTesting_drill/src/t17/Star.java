package t17;

public class Star {

	public static void main(String[] args) {
		char grade;
		double avg = 80;

		grade = getGrade(avg);

		// 우 입니다.
		System.out.println(grade + " 입니다.");
	}
	public static char getGrade(double avg) {
		char ret='a';
		if(avg>= 90) 
			ret ='수';
		else if(avg >= 80)
			ret = '우';
		else if(avg >= 70)
			ret = '미';
		else if(avg >= 60)
			ret = '양';
		else
			ret = '가';
			
		return ret;
	}

}
