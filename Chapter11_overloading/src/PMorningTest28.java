import java.util.Scanner;
/*
 *돈을 입력하세요
12900
오만원 : 0장
만원 : 1장
오천원 : 0장
천원 : 2장
오백원 : 1개
백원 : 4개
계속 Y :: 중단 N
 */
public class PMorningTest28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		String str;
		char key;
		
		while(true) {
			System.out.println("돈을 입력하세요.");
			money = sc.nextInt();
			System.out.println(money);
			Money mon = new Money(money);
			mon.show();
			
			System.out.println("게속 Y :: 중단 N");
			str = sc.next(); 
			System.out.println(str);
			key = str.charAt(0);
		
			if(key == 'N' || key == 'n') {
				System.out.println("-exit-");
				break;
				
			}
			
			
			
			
		}

	}


	
	
	
}	