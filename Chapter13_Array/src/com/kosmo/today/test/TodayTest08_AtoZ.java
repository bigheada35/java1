/*
 char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력
 */

package com.kosmo.today.test;

public class TodayTest08_AtoZ {

	public static void main(String[] args) {
		char[] ca = new char[26];
		// 입력할때는 for-each 사용 불가
		for(int i=0; i<ca.length; i++) {
			// 에러  :   ca[i] = 'A'+ i;
			// 필요 :  int -> char
			ca[i] =  (char)('A'+ i);
		}
		for(char e : ca) {
			System.out.print(e + " ");
		}
	}
}



