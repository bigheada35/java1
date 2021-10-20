package com.kosmo.ex.teacher.main;
import java.util.Arrays;

public class ForEach {
	public static void main(String[] args) {
		Box3[] ar = new Box3[5];
		ar[0] = new Box3(101, "Coffee");
		ar[1] = new Box3(202, "Computer");
		ar[2] = new Box3(303, "Apple");
		ar[3] = new Box3(404, "Dress");
		ar[4] = new Box3(505, "Fairy-tale book");
		
		for(Box3 e : ar) {
			if(e.getBoxNum() == 505) 
				System.out.println(e);
		}
	}
}

class Box3{
	private int boxNum;
	private String contents;
	
	Box3(int boxNum, String str){
		this.boxNum = boxNum;
		this.contents = str;
	}
	int getBoxNum() {
		return boxNum;
	}
	public String toString(){
		return contents;
	}
}






