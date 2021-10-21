package com.kosmo2.morningtest;

public class Test31Box {

	public static void main(String[] args) {

        Box[] ar = new Box[5];
        ar[0] = new Box(101, "Coffee");
        ar[1] = new Box(202, "Computer");
        ar[2] = new Box(303, "Apple");
        ar[3] = new Box(404, "Dress");
        ar[4] = new Box(505, "Fairy-tale book");

        for (Box e : ar) {
                if (e.getBoxNum() == 505) {
                		//
                		// 주의:  println()에 참조변수값이 들어 갈때는, 해당 클래스에 toString이 있어야 함.
                		//
                        System.out.println(e);
                }
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
	
	int getBoxNum() {
		return num;
	}
	
	//
	// 주의:  println() 안에서 toString() 호출할려면 public 이여야 함.
		
	//
	public String toString() {
		return name;
	}
	
	
}