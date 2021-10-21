/*
 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
배열에 저장하라. 
그리고 배열에 든 숫자들과 평균을 출력하라.

랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9
평균은 5.4
 */
package com.kosmo.today.test;

public class TodayTest09_Array10 {

	public static void main(String[] args) {
		IntArray ia = new IntArray();
		ia.showAvg();
	}
}

class IntArray{
	private int[] ia = new int[10]; 
	IntArray() {
		// 입력시 for-each 사용 불가 :  for(int e : ia) 
		for(int i=0; i<ia.length; i++) {
			ia[i] = gen();
		}
	}
	int gen() {
		double r = Math.random();
		return (int)(r * 10 + 1);
	}
	void showAvg() {
		double avg = 0.0;
		int sum = 0;
		for(int e : ia) {
			System.out.print(e + " ");
			sum += e;
		}
		System.out.println();
		avg = sum/(double)ia.length;
		System.out.println("평균:" + avg);
	}
	
}



