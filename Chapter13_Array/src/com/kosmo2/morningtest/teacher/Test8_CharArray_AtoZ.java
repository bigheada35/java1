/*
char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력 해보자. 
알파벳은 26개.
 */

package com.kosmo2.morningtest.teacher;

import java.util.Scanner;
public class Test8_CharArray_AtoZ {

	public static void main(String[] args) {
		char[] alpabet = new char[26];
		for(int i=0; i<alpabet.length; i++) {
			//
			// 중요 부분 :  형변환     (char + int = int ) int --> char
			//
			alpabet[i] = (char)('A' + i);
		}
		for(char e : alpabet) {
			System.out.println(e);
		}
	}

}

