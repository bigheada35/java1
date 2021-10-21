/*
 - 5개의 숫자를 랜덤 으로 받아 배열로 저장
- 5개의 숫자 중 가장 큰 값을 출력
 */
package com.kosmo.today.test;

public class TodayTest07_GetMax {

	public static void main(String[] args) {
		Array2 ar = new Array2();
		ar.show();
		ar.showMx();
	}

}

class Array2{
	private int[] ia = new int[5];

	Array2() {
		for(int i=0; i<ia.length; i++) {
			ia[i] = gen();
			//
			//중복처리
			//
			for(int j=0; j<i; j++) {
				if(ia[j] == ia[i]) {
					i--;
					//break;
				}
			}
		}
	}
	int gen() {
		double r = Math.random();
		int rand = (int)(r * 40 + 1);
		return rand;
	}
	void show() {
		for(int e : ia) { 
			System.out.print(e + " ");
		}
		System.out.println();
	}
	void showMx() {
		int large = 0;
		/*
		for(int e : ia) {
				if(large < e) {
					large = e;
				} 
				for(int j=0; j<ia.length; j++) {
					if(large < ia[j]) {
						large = ia[j];
					}
				}
				
		}
		*/
		for(int i=0; i<ia.length; i++) {
			if(large < ia[i]) {
				large = ia[i];
			} 
			for(int j=0; j<ia.length; j++) {
				if(large < ia[j]) {
					large = ia[j];
				}
			}
			
		}
		
		System.out.println("max:"+ large);
	}
}

