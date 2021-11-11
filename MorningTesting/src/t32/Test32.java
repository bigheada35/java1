package t32;

import java.util.Scanner;

public class Test32 {
	public static void main(String[] args) {

		Rectangle[] arrayRec = new Rectangle[3];
		for(int i =0 ;i < 3; i++) {
			arrayRec[i] = new Rectangle();
		}

		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arrayRec[i].set(x,y);
		}
		
		System.out.println(total(arrayRec));
	}
	
	public static int total(Rectangle[] arrayRec) {
		int sum = 0;
		for(int i=0; i< arrayRec.length; i++)
			sum += arrayRec[i].space();
		return sum;
	}
	
	
}


class Rectangle{
	private int x,y,space;
	public void set(int x, int y){
		this.x = x;
		this.y = y;
	}

	int space(){
		return x*y;
	}
	
}
/*

*/