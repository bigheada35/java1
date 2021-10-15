
public class TTodayTest3 {

	public static void main(String[] args) {
		int sum = getHap(1,100);
		//5050
		System.out.println(sum);
		
	}

	private static int getHap(int start, int end) {
		int sum=0;
		for(int i=start; i<=end; i++) {
			sum += i;
		}
		return sum;
	}




	
}
