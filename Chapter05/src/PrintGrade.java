
public class PrintGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int kor = 80;//100;//90;//50;
//		int eng = 92;//70;//60;
//		int math = 90;

		int kor,eng,math;
		kor = 50;	eng = 60;	math = 90;
		
		
		int num1;
		int num2=100;
		int num3 = 10;
		
		num1 = (num2 > num3)? num2 : num3;
		System.out.println(num1);
		
		
		int total = kor + eng + math;
		//double mean = total/(double)3.0;
		double mean = total/(double)3.0;
	
		System.out.println("국:" + kor + " 영:" + eng + " 수:" + math );
		System.out.println("평균:"+ mean);
		
		if(mean >= 90) {
			//수
			System.out.println("수");
		}else if(mean >= 80) {
			//우
			System.out.println("우");
		}else if(mean >= 70) {
			//미
			System.out.println("미");
		}else {
			//가
			System.out.println("가");
			
			
		}
	}
	
	

}
