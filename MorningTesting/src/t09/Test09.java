package t09;


public class Test09 {
	public static void main(String[] args) {
		
		int kor = 89;
		int eng = 91;
		int mat = 92;
		
		double tot = kor + eng + mat;
		double avg = tot/(double)3;
	
		
		grade(kor);
		grade(eng);
		grade(mat);
		
	}
	public static void grade(int score) {
		if(score >= 90)
			System.out.println("수 입니다.");
		else if(score >= 80)
			System.out.println("우 입니다.");
		else if(score >= 70)
			System.out.println("미 입니다.");
		else if(score >= 60)
			System.out.println("양 입니다.");
		else
			System.out.println("가 입니다.");
		
	}
	
	
	
}

