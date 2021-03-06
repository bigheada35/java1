
public class TodayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("--2-- ");	
			/*
			 * 2. 아래와 같이 출력 되도록 프로그래밍 하시오.(//반복문 사용 할 필요 없음)
				126500 의 금액을 한국 화폐로 바꾸었을 때 각각 몇 개의 화폐가 필요한지 계산해서 출력하기
				예) int 126500;
					오만원 : 2장	
					만원:    2장
					오천원 :1장
					천원: 1
					오백원: 1개
					백원: 0개
			 */
			int mon = 126500;
			int remain=0;
			int mon_50000;
			int mon_10000;
			int mon_5000;
			int mon_1000;
			int mon_500;
			int mon_100;
			
			mon_50000 = mon/50000;		remain = mon%50000;
			mon_10000 = remain/10000;	remain = remain%10000;
			mon_5000 = remain/5000;		remain = remain%5000;
			mon_1000 = remain/1000;		remain = remain%1000;
			mon_500 = remain/500;		remain = remain%500;
			mon_100 = remain/100;		remain = remain%100;
			
			
			System.out.println( mon + "  = ");
			System.out.println("\t 오만원:"+ mon_50000 +"장");
			System.out.println("\t + 만원:"+ mon_10000 +"장");
			System.out.println("\t + 오천원:"+ mon_5000 +"장");
			System.out.println("\t + 천원:"+ mon_1000 +"장");
			System.out.println("\t + 오백원:"+ mon_500 +"개");
			System.out.println("\t + 백원:"+ mon_100 +"개");
			
			//int r = 126500;
			//int c50000=0, c10000=0, c5000=0, c1000=0, c500=0, c100=0;
	
		}
		
		{
			System.out.println("--3-- ");	
			/*
			 * 3.구구단 출력 하시오.
			 */
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					System.out.println(i + " X " + j +" = " + (i*j));
					
				}
				System.out.println();
			}
		}
		
		{
			/*
			 * 4.구구단 짝수단 출력 하시오.
			 */
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(i%2 == 0) {
						System.out.println(i + " X " + j +" = " + (i*j));
					}
				}
				System.out.println();
			}
		}
		
		{
			/*
			 * 5. 3의 배수인 단(3,6,9)만 출력 하시오.
			 */
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(i%3 == 0) {
						System.out.println(i + " X " + j +" = " + (i*j));
					}
				}
				System.out.println();
			}
		}			
		
		{
			System.out.println("--6-- ");
			/*
			 * 6.아래의 별을 찍으시오.
					*****
					*****
					*****
					*****
			 */
			for(int i=0; i<4; i++) {
				for(int j=0; j<5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		{
			System.out.println("--7-- ");	
			/*
			 * 7.아래의 별을 찍으시오.
						*
						**
						***
						****
						*****
			 */
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(j>i) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
		}
		

		{
			System.out.println("--8-- ");
			/*
			 * 8.아래의 별을 찍으시오.
				*****
				****
				***
				**
				*
			 */
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(j >= (5-i)) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}	
			
		}		
		
		{
			System.out.println("--9-- ");	
			/*
			 * 9.아래의 별을 찍으시오.
					    *
					   **
					  ***
					 ****
					*****
			 */
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(j >= (4-i)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}			
		}
		
		{
			System.out.println("--10--");
			/*
			 * 10.아래의 별을 찍으시오.
					*****
					 ****
					  ***
					   **
						*
			 */
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(j>=i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}	
			
		}
		
		{
			System.out.println("--11--");	
			/*
			 * 11.아래의 별을 찍으시오.

				    *
				   ***
				  *****
				 *******
				*********
			 */
			for(int i=0; i<5; i++) {
				for(int j=0; j<9; j++) {
					if((j>= 4-i) && (j <= 4+i) ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}			
			
		}
		{
			System.out.println("--12--");
			/*
			 * 12. 구구단 에서 2의 배수 이자 3의 배수인 수의 갯수는?
			 */
			int cnt=0;
			int res=0;
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					res = i*j;
					if( (res%2 == 0) && (res%3 == 0)) {
						System.out.println(i + " X " + j +" = " + (i*j));
						cnt++;						
					}
				}
			}
			System.out.println("구구단 에서 2의 배수 이자 3의 배수인 수의 갯수 :" + cnt);
		}
		
		{
			System.out.println("--13--");
			/*
			 * 13.다음과 같이 출력하시오.
					1. Hi
					2. Hi
					3. Hi
					4. Hi
					5. Hi
			 */
			for(int i=1; i<6; i++) {
				System.out.println(i + ". Hi");
			}
		}
		
		{
			System.out.println("--14--");	
			/*
			 * 14.아래와 같이 출력 하시오.
				1 1 1 1 1
				2 2 2 2 2
				3 3 3 3 3
				4 4 4 4 4
				5 5 5 5 5
			 */
			for(int i=1; i<6; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
		{
			System.out.println("--15--");
			/*
			 * 15.아래와 같이 출력 하시오.
					2 3 4 5 6
					3 4 5 6 7
					4 5 6 7 8
					5 6 7 8 9
					6 7 8 9 10
			 */
			for(int i=2; i<2+5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print((i+j)+" ");
				}
				System.out.println();
			}
			
		}
		{
			/*
			 *  
			 * swithc 문에서 아래의 프로그래밍을 짜시오.
				1234 월 봄입니다.출력
				5678 월 여름입니다.출력
				9 10 11 12 월 겨울 입니다. 출력
			 */
			int month = 8;
			switch(month) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("봄입니다.");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.println("여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
			case 12:
				System.out.println("겨울 입니다.");
				break;			
			}
		
		}
		
		{
			/*
			 *  구구단 6단을 출력 하는 프로그램을 짜시오.
			 */
			for(int i=1; i<=9; i++) {
				System.out.println(6 + " x " + i + " = " + (6*i));
			}
		}
		
		{
			
			/*
			 * 1과 10000 사이의 숫자중 5의 배수이자 7의 배수인 
				수의 갯수는(프로그램밍 하시오)
			 */
			int cnt=0;
			for(int i=1; i<= 10000; i++) {
				if((i%5 == 0) && (i%7 == 0)) {
					cnt++;
				}
			}
			System.out.println("1과 10000 사이의 숫자중 5의 배수이자 7의 배수인 \r\n"
					+ "	수의 갯수 : " + cnt);
		}
		
	
	}

}
