package com.kosmo.today.test;

public class TodayTest7 {

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
		System.out.println("max:"+ large);
	}
}

