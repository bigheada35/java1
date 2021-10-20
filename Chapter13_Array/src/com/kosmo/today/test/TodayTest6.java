package com.kosmo.today.test;

public class TodayTest6 {

	public static void main(String[] args) {
		Array ar = new Array();
		ar.get3Mul();
	}

}

class Array{
	private int[] ia = new int[100];
	Array() {
		for(int i=0; i<ia.length; i++) {
			ia[i] = i;
		}
	}

	void get3Mul() {
		for(int e : ia) {
			if(e % 3 == 0) {
				System.out.print(e + " ");
			}
		}
	}
}

