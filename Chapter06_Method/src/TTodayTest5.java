
public class TTodayTest5 {

	public static void main(String[] args) {
		printGuGudan(3);// 3단 출력
		printGuGudan(4);// 4단 출력
	}

	private static void printGuGudan(int dan) {
		int res = 0;
		for(int i=1; i<=9; i++) {
			res = dan * i;
			System.out.println(dan + " x " + i +" = " + res);
		}
		System.out.println();
	}







	
}
