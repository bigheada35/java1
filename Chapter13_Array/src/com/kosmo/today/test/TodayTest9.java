package com.kosmo.today.test;

public class TodayTest9 {

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



