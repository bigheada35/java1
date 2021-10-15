import java.util.Scanner;

public class ScanerTest {

	public static void main(String[] args) {
		String source = "1 3 5";
		//String source = "1, 3, 5";
		//Scanner sc = new Scanner(source);
		
		//Scanner sc = new Scanner(System.in.read());
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println(num1+"," + num2 +","+ num3+"," + sum);
	}

}
