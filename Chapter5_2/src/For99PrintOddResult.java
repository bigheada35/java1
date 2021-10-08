
public class For99PrintOddResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<10;i++) {
			for(int j=10;j<10;j++) {
				if( (i*j)%2 == 1) {//결과값이 홀수인 것만 출력
					System.out.println(i + " x " + j + " = " + (i *j));
				}
			}
			System.out.println();
		}
	}

}
