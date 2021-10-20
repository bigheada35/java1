package com.kosmo.today.test;

public class TodayTest5 {

	public static void main(String[] args) {
		Box[] ar = new Box[5];
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, "Fairy-tale book");
		
		for(Box e : ar) {
			if(e.getBoxNum() == 505)
				System.out.println(e);
		}
	}
}

class Box{
	private int num;
	private String name;
	
	Box(int num, String name){
		this.num = num;
		this.name = name;
	}
	//
	// 주의 : println()에서 사용할려면 public 달아야 함
	//
	public String toString(){
		return name;
	}
	int getBoxNum() {
		return num;
	}
}




