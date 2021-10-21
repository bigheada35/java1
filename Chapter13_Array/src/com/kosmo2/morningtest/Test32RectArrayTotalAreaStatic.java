package com.kosmo2.morningtest;

import java.util.Scanner;

public class Test32RectArrayTotalAreaStatic {

	public static void main(String[] args) {
	
		Rectangle[] ra = new Rectangle[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<ra.length; i++) {
			System.out.println("가로세로를 입력하세요.");
			int w = sc.nextInt();
			int h = sc.nextInt();
			ra[i] = new Rectangle(w,h);
		}
		
		totalRecArea(ra);
		
	}

	static void totalRecArea(Rectangle[] ra) {
		int tot=0;
		for(int i=0; i<ra.length; i++) {
			tot += ra[i].Area();
		}
		System.out.println("tot: "+ tot);
	}
}


class Rectangle{
	private int w;
	private int h;
	Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}
	int Area(){
		return w*h;
	}
	
}