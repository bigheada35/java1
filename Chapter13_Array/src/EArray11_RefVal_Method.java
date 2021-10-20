
public class EArray11_RefVal_Method {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		System.out.println(sumOfAry(ar));
	}
	
	static int sumOfAry(int[] ar) {
		int sum = 0 ;
		for(int i =0; i<ar.length; i++) {
			sum += ar[i];
		}
		return sum;
	}
	
}





