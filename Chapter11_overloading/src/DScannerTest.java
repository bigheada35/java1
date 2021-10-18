import java.util.Scanner;

//import java.util.Scanner;

public class DScannerTest {

	public static void main(String[] args) {
		boolean exit = false;
		
		do{
			System.out.println("돈을 금액을 입력하세요");
			Scanner sc = new Scanner(System.in);
			/*
			 * 참고 : 스트링을 받을때는 
			 * String s1 = sc.next();
			 */
			//String strin = sc.next();
			int mon_in = sc.nextInt();
			
			System.out.println("입력: " + mon_in);
			
			Money mon_d = new Money(mon_in);
			mon_d.show();
			
			System.out.println("계속하시겠습니까? Y/N");
			String str = sc.next();
			
			/*
			 스트링의 첫번째 Byte 만 읽어 내는 방법
			 str.charAt(0);
			 */
//			char key = str.charAt(0);
//			System.out.println("key:" + key);
//			
//			char key1 = str.charAt(1);
//			System.out.println("key1:" + key1);	
			
			System.out.println("--test1--");
			for(int i=0; i<str.length(); i++) {
				//System.out.println("key(" + i + "):" + str.charAt(i));	
				//System.out.println("key:" +  str.charAt(i));
				System.out.print(str.charAt(i));
			}
			System.out.println();
			System.out.println("--test2--");
			int len = str.length();
			for(int i = (len-1); i>= 0; i--) {
				
				//System.out.println("key(" + i + "):" + str.charAt(i));	
				//System.out.println("key:" +  str.charAt(i));
				System.out.print(str.charAt(i));
			}	
			System.out.println("--------");
			char key = str.charAt(0);
			if(key == 'Y'|| key == 'y') {
				System.out.println("-exit-");
				exit = true;
			}
			
			
//			/*
//			 스트링 전체를 비교 하는 방법  
//			 */
//			if(str.equals("N") || str.equals("n")) {
//				exit = true;
//			}
//			
			
		}while(exit == false);
		System.out.println("종료");
	}


	
	
	
}	