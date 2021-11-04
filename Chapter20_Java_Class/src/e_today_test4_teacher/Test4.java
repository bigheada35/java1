package e_today_test4_teacher;
/*

 */
import java.util.Scanner;
public class Test4 {
	public static void main(String[] args) {
		Scanner sc;
		UpDownGame game;
		
		while(true) {
			
			try { //주의 : 크게 묶어 주자
				sc = new Scanner(System.in);
				System.out.println("게임시작 1");
				System.out.println("게임시작 2");
				System.out.println(">>");
				
				int num = sc.nextInt();
				
				
				if(num == 1) {
					game = new UpDownGame();
					game.run();
				}else{
					System.out.println("게임을 종료합니다.");
					break;
				}
				
				
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.처음부터 다시 입력하세요.");
			}
			

		}
	}
}

class UpDownGame{
	private static int COUNT = 10;
	private int[] arrInput;
	private int answer;
	public UpDownGame() {
		arrInput = new int[COUNT];
		answer = (int)(Math.random()*100 + 1);
	}
	public void run() {
		try {
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<arrInput.length; i++) {
				System.out.println("숫자를 입력해 주세요");
				int num = sc.nextInt();
				if(num > answer) {
					System.out.println("Down ==>" + (COUNT-i-1) + "번 남았습니다.");
				}else if(num < answer) {
					System.out.println("Up ==>" + (COUNT-i-1) + "번 남았습니다.");
					
				}else {
					System.out.println("일치");
					break;
				}
			}
			
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다.처음부터 다시 입력하세요.");
			// 주의 : 재귀호출~!!
			run();
		}
		
		
		
	}
}
