package com.kosmo.today.teacher;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Rectangle[] recArr = new Rectangle[3];
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		for(int i =0; i< recArr.length; i++) {
			System.out.println("가로 세로를 넣으세요");
			int width = sc.nextInt();
			int height = sc.nextInt();
			recArr[i] = new Rectangle(width, height);
			sum = sum + recArr[i].getArea();
		}
		System.out.println(Rectangle.getArrArea(recArr));

	}

}


class Rectangle{
	private int width;
	private int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width * height;
	}
	
	static int getArrArea(Rectangle[] recArr) {
		int sum=0;
		for(int i =0; i< recArr.length; i++) {
			sum = sum + recArr[i].getArea();
		}
		return sum;
	}
	
}
