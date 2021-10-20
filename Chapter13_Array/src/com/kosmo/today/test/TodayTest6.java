package com.kosmo.today.test;

public class TodayTest6 {

	public static void main(String[] args) {
		Array ar = new Array();
		ar.show();
		ar.get3Mul();
	}

}

class Array{
	private int[] ia = new int[100];
	Array() {
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
		int rand = (int)(r * 100 + 1);
		return rand;
	}
	void show() {
		System.out.println("100개 랜덤:");
		for(int e : ia) { 
			System.out.print(e + " ");
		}
		System.out.println();
	}
	void get3Mul() {
		System.out.println("3의 배수:");
		for(int e : ia) {
			if(e % 3 == 0) {
				System.out.print(e + " ");
			}
		}
		System.out.println();
	}
}

