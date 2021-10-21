/*
 - 5개의 숫자를 랜덤 으로 받아 배열로 저장
- 5개의 숫자 중 가장 큰 값을 출력
 */

package com.kosmo2.morningtest.teacher;

import java.util.Scanner;
public class Test7_GetMax {

	public static void main(String[] args) {
		ArrMax am = new ArrMax();
		am.printMax();
	}

}

class ArrMax{
	private int[] arr;
	ArrMax(){
		arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			//랜덤함수는 외우자
			arr[i] = (int)(Math.random()*100 + 1);
		}
	}
	void printMax() {
		for(int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if( max < arr[j]) {
					max = arr[j];
				}
			}
		}
		System.out.println("max:" + max);
	}
}