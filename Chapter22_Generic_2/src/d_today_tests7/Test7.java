package d_today_tests7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test7 {

	public static void main(String[] args) {

		while(true) {

			try {
				System.out.print(">>");
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
		
				StringTokenizer token = new StringTokenizer(str, " ");
	
				int count = token.countTokens();
				
				for (int i=0; i< count; i++) {
					
					if(token.hasMoreTokens()) {
						String strTemp = token.nextToken();
						//System.out.println(strTemp);
						if(strTemp.equals("그만")) {
							System.out.println("종료합니다...");
							return;
						}
					}
				}
				System.out.println("어절 개수는 " + count);
			
				// 주의 : 이것은 사용 불가 하다. Override한 toString이 StringTokenizer 안에 안들어 잇는 건가?
				//System.out.println(Arrays.toString(token));
				
			} catch (Exception e) {
				
			}
			

		}//while
	}


}

/*
 * 결과:
 * 
 */

/*

*/