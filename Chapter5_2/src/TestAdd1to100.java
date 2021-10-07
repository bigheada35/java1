
public class TestAdd1to100 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// if(i % 2 != 0) {
			if (i % 2 == 0) {
				// System.out.print(i +",");
				sum += i;
			}
		}
		// System.out.println(" 1 + 2 + ... + 100 = " + sum); // 결과: 5050
		// System.out.println(" 1 ~ 100 까지중 홀수의 합 = " + sum); // 결과 : 2500
		System.out.println(" 1 ~ 100 까지중 짝수의 합 =  " + sum); // 결과 : 2550
		// 1 ~ 100 까지중 홀수의 합 = 2500
		// 1 ~ 100 까지중 짝수의 합 = 2550

	}

}
