
public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국영수 총점 평균 및 수우미양가출력
		int kor = 84;
		int eng = 77;//75;
		int math = 93;
		
		//kor = 60; 	eng = 56;	math = 40;
		kor = 60; 	eng = 56;	math = 80;
		
		int total = kor + eng + math ;
		double mean = total/(double)3;
		System.out.println( "총점"+ total + ", 평균:" + mean);
		if(mean >= 90)
			System.out.println("수");
		else if(mean >= 80)
			System.out.println("우");
		else if(mean >= 70)
			System.out.println("미");
		else if(mean >= 60)
			System.out.println("양");
		else 
			System.out.println("가");
			
	}
			

}
