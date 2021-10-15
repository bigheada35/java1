import java.util.Scanner;

public class ScanerTest4RandomRockPaperScissors {

	public static void main(String[] args) {

		boolean exit = false;

		do {
			System.out.println("가위 바위 보 , 중 하나를  입력하세요");

			Scanner sc = new Scanner(System.in);
			String s1 = sc.next();
			//System.out.println(s1);

			System.out.println("컴퓨터:");
			RockPaperScissors rps = new RockPaperScissors();
			System.out.println(rps.getRPS());
			System.out.println(rps.compareRPS(s1));
			

			System.out.println("끝내시겠습니까?(y/n)");
			// ??? char 1개만 입력 받는 방법은 ???
			// Byte s2 = sc.nextByte();
			String s2 = sc.next();
			System.out.println(s2);
			
			// 스트링 비교 방법은 ?
			if (s2.equals("y")) {
				exit = true;
			}

		} while (exit == false);

		System.out.println("끝");
	}
}
