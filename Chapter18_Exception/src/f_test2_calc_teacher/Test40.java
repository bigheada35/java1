package f_test2_calc_teacher;

import java.util.Scanner;

/*
아래의 결과를 나타내는 사칙연산 계산기를 완성하시오.
-주의 잘못된 입력이 있으면 처음부터 다시 입력을 받도록 
예외처리 구문(try catch)을 넣을것

*** 계산기 ***
수1 : 10
수2 : 20
연산 : +
계산 결과 : 30
계속 하시겠습니까? 계속 : Y , 종료 : N
y
*** 계산기 ***
수1 : R
잘못된 입력입니다. 다시입력해 주세요
*** 계산기 ***
수1 : 10
수2 : 20
연산 : *
계산 결과 : 200
계속 하시겠습니까? 계속 : Y , 종료 : N
y
*** 계산기 ***
수1 : 90
수2 : 80
연산 : /
계산 결과 : 1
계속 하시겠습니까? 계속 : Y , 종료 : N
n
종료입니다.
*/

public class Test40 {

	public static void main(String[] args) {
		int num1 =0;
		int num2 = 0;
		int result = 0;
		String op = null;
		
		//Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			
				System.out.println("*** 계산기 ***");
				
			try {
				
				Scanner scan = new Scanner(System.in);
				
				System.out.print("수1 :");
				num1 = scan.nextInt();
				
				System.out.print("수2 :");
				num2 = scan.nextInt();
				
				System.out.print("연산 :");
				op = scan.next();
				
				switch (op) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;				
				default:
					System.out.println("잘못된 연산자 입력입니다.");
				}
		
				System.out.println("계산 결과 :" + result);
				
				
				System.out.println("계속 하시겠습니까? 계속 : Y , 종료 : N");
				String finish = scan.next();
				// 주의 : String은 equals 사용. ( finish == "N" 이거 쓰면 안됨 )
				if(finish.equals("N") || finish.equals("n")) {
					System.out.println("종료입니다.");
					break;
				}
			}catch(Exception e) {
				System.out.println("잘못된 입력입니다. 다시입력해 주세요");
				continue;
			}
			
			
			
		}//while(true)
		
	}
	
}
