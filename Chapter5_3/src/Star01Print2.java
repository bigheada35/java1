
public class Star01Print2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int k=1;
//		for(int j=0;j<5;j++) {
//			for(int i=0;i<k;i++) {
//				System.out.print("*");
//			}
//			k++;
//			System.out.println();
//		}

		// *
		// **
		// ***
		// ****
		// *****
		// k 이용 말고 i,j만 이용해서 만들기
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
