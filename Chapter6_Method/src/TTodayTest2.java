
public class TTodayTest2 {

	public static void main(String[] args) {
		char grade;
		double avg = 80;
		grade = getGrade(avg);
		
		// 우 입니다.
		System.out.println(grade + " 입니다.");// 우 입니다.
		
	}

	private static char getGrade(double avg) {
		char gra = '가';
		if(avg>=90)
			gra = '수';
		else if(avg >= 80)
			gra = '우';
		else if(avg >= 70)
			gra = '미';
		else if(avg >= 80)
			gra = '양';
		else
			gra = '가';
		return gra;
	}

	
}
