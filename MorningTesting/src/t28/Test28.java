package t28;

import java.util.Scanner;

public class Test28 {
	public static void main(String[] args) {

		while(true) {
			System.out.println("돈을 입력 하세요");
			Scanner sc = new Scanner(System.in);
			int r = sc.nextInt();
			//int r = 12900;
			System.out.println("오만원:" + r/50000 + "장");
			r = 12900%50000;
			System.out.println("만원:" + r/10000 + "장");
			r = r%10000;
			System.out.println("오천원:" + r/5000 + "장");
			r = r%5000;
			System.out.println("천원:" + r/1000 + "장");
			r = r%1000;
			System.out.println("오백원:" + r/500 + "개");
			r = r%500;
			System.out.println("백원:" + r/100 + "개");
			r = r%100;
			
			System.out.println("계속 Y, 중단 N");
			String q = sc.next();
			if(q.equals("N"))
				break;
			
		}
		
	}
	

	
}


