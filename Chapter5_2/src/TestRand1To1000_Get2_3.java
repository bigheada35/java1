
public class TestRand1To1000_Get2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long total = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				total += i;
				System.out.println("1~1000 사이의 숫자중 2의 배수이자 3의 배수인 수: " + i + ", 합:" + total);
			}
		}
		
		System.out.println(", 합:" + total);
	}

}
