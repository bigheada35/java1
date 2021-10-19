package edu.kosmo.ex.vow;
/*
 8. 사용자로부터 받은 문자열(영문으로)에서 자음과 모음 개수를 계산하는 프로그램을 작성
 */
public class ConsVowCount {
	private String word;
	private int consonant;
	private int vowel;
	
	public ConsVowCount(String word){
		this.word = word;
		consonant = 0;
		vowel = 0;
	}
	private void count(char ch) {
		switch(ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':	
			case 'u':	
			case 'U':
				vowel++;
				break;
			default:
				consonant++;
				break;
		}
		
	}
	public void countResult() {
		for(int i=0; i < word.length(); i++) {
			char ch = word.charAt(i);
			count(ch);
		}
		System.out.println("총글자수는 " + word.length());
		System.out.println("모음 갯수 : " + vowel);
		System.out.println("자음 갯수 : " + consonant);
	}
	
}
