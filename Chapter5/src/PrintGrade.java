
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
	
		System.out.println("��:" + kor + " ��:" + eng + " ��:" + math );
		System.out.println("���:"+ mean);
		
		if(mean >= 90) {
			//��
			System.out.println("��");
		}else if(mean >= 80) {
			//��
			System.out.println("��");
		}else if(mean >= 70) {
			//��
			System.out.println("��");
		}else {
			//��
			System.out.println("��");
			
			
		}
	}
	
	

}
