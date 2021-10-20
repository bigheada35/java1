package com.kosmo.today.teacher;

import java.util.Scanner;

public class Ex10_Better_Nice {

	public static void main(String[] args) {
		
		Rectangle2[] recArr = new Rectangle2[3];
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		for(int i =0; i< recArr.length; i++) {
			System.out.println("가로 세로를 넣으세요");
			int width = sc.nextInt();
			int height = sc.nextInt();
			recArr[i] = new Rectangle2(width, height);
			sum = sum + recArr[i].getArea();
		}
		System.out.println("sum:"+ sum);
		System.out.println(getArrArea(recArr));

	}
	
	static int getArrArea(Rectangle2[] recArr) {
		int sum=0;
		for(int i =0; i< recArr.length; i++) {
			sum = sum + recArr[i].getArea();
		}
		return sum;
	}

}

class Rectangle2{
	private int width;
	private int height;
	
	Rectangle2(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width * height;
	}
	

	
}
