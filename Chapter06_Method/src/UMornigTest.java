
public class UMornigTest {

	public static void main(String[] args) {
/*
아래의 함수를 만드시오.                 

char grade;
double avg = 80;

grade = getGrade(avg);

// 우 입니다.
System.out.println(grade + " 입니다.");


 */
		char grade;
		double avg = 80;
		grade = getGrade(avg);
		System.out.println(grade + " 입니다.");
	}
	
	public static char getGrade(double avg) {
		char res='가';
		if(avg >= 90)
			res = '수';
		else if(avg >= 80)
			res = '우';
		else if(avg >= 70)
			res = '미';
		else if(avg >= 60)
			res = '가';
		return res; 
	}


	







	
}
