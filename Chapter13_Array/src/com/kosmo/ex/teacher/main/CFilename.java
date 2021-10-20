package com.kosmo.ex.teacher.main;
import java.util.Scanner;

/*


 */

public class CFilename {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String w1 = null;
		String w2 = null;
		
		int dot = 0;
		
		for(int i=0; i< word.length(); i++) {
			if(word.charAt(i) == '.') {
				dot = i;
				//w1 = word.substring(0, i);
				//w2 = word.substring(i+1, word.length());
				//break;
			}
		}
		w1 = word.substring(0, dot);
		w2 = word.substring(dot + 1, word.length());
		System.out.println(w1 + ", " + w2);
	}
}




