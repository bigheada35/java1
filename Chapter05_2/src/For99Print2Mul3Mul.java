
public class For99Print2Mul3Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if( ((i*j)%2 == 0) && ((i*j)%3 == 0)) {//결과값이 2의 배수이자 3의 배수인  수의  갯수
					System.out.println(i + " x " + j + " = " + (i *j));
					count ++;
				}
			}
			System.out.println();
		}
		System.out.println("결과값이 2의 배수이자 3의 배수인  수의  갯수: "+count);
	}

}
