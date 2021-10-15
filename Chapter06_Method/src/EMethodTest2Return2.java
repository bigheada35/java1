
public class EMethodTest2Return2 {

	public static void main(String[] args) {
		char grade;
		//double avg = 20;
		double avg = 85;
		
		grade = getGrade(avg);
		
		System.out.println( grade + " 입니다.");
	}

	private static char getGrade(double avg) {
		char result = '가';
		if(avg >= 90)
			result = '수';
		else if(avg >= 80)
			result = '우';
		else if(avg >= 70)
			result = '미';
		else if(avg >= 60 )
			result = '양';
		else
			result = '가';
		
		return result;
	}

}
