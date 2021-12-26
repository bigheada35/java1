package t17;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		double avg = 80;

		grade = getGrade(avg);
		// 우 입니다.
		System.out.println(grade + " 입니다.");
	}
	public static char getGrade(double avg) {
		char str=' ';
		if(avg>= 90)		
			str = '수';
		else if(avg>= 80)	
			str = '우';
		else if(avg>= 70)	
			str = '미';
		else if(avg>= 60)	
			str = '양';
		else 				
			str = '가';
	
		return str;
	}

}

/*
아래의 함수를 만드시오.                 

char grade;
double avg = 80;

grade = getGrade(avg);

// 우 입니다.
System.out.println(grade + " 입니다.");
*/