package today_test4;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("**************");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 종료");
			System.out.println("**************");
			
			try {// 주의 : 가능한 넣기
				int start = sc.nextInt(); 
				if(start == 1) {
					System.out.println("게임시작");
					//System.out.println("1~100까지의 숫자를 입력하세요");
					int rand = (int)(Math.random()*100 + 1);
					
					for(int i=0; i<10; i++) {
						System.out.println(">>>");
						int user = sc.nextInt();
						
						if(i==9 && rand != user) {
							//System.out.println("10번 기회가 지나서 종료 합니다.");
							break;
						}
						
						if(rand > user) {
							//System.out.println("up된 수를 입력하세요");
							System.out.println("up");
						}else if(rand < user) {
							//System.out.println("down된 수를 입력하세요");
							System.out.println("down");
						}else {
							System.out.println("맞았다");
							break;
						}
					}
				}
				else {
					System.out.println("게임 종료");
					break;
				}
			}catch(Exception e) {// 주의 : 가능한 넣기
				System.out.println("잘못된 입력 입니다.");
				sc.nextLine();// 주의 : 버퍼삭제
			}
				
		}//while(true) 	// 주의 : 되도록이면 넣어 주기
		
			
	}
}

/* 결과:

*/

/*
1. 랜덤으로 숫자를 생성 - 컴퓨터가 가짐
2.게임을 시작 유저가 숫자를 입력
3. 10번의 기회를 주어 맞으면 맞았다고 출력 10번의 기회가 지나면 게임 종료.

출력의 예
========================================

**************
1. 게임 시작
2. 게임 종료
**************
1
게임시작
>>>
50
down
>>>
45
down
>>>
30
down
>>>
20
down
>>>
10
up
>>>
15
up
>>>
17
맞았다
**************
1. 게임 시작
2. 게임 종료
**************


*/