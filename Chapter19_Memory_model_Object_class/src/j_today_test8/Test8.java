package j_today_test8;

import java.util.Scanner;

/*
8. 문자열을 입력 받아 한 글자씩 회전시켜 모두 출력하는 프로그램을 작성하라.
(클래스로 작성할 필요없이 메인에서 직접 할것)
[Hint] Scanner.nextLine()을 이용하면 빈칸을 포함하여 한 번에 한 줄을 읽을 수 있다.
문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.

I Love you
Love youI
Love youI
ove youI L
ve youI Lo
e youI Lov
youI Love
youI Love
ouI Love y
uI Love yo
I Love you
 */

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String str = sc.nextLine();
		for(int i=0; i<str.length()+1; i++ ) {
			int k=i;
			for(int j=i; j<(i+str.length()); j++ ) {
				if(k == str.length()) {
					k=0;
				}
				System.out.print(str.charAt(k++));
			}
			System.out.println();
		}
	}
}

