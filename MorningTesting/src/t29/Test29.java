package t29;

import java.util.Scanner;

public class Test29 {
	public static void main(String[] args) {

		int[] array = new int[5];
		for(int i=0; i<array.length; i++) {
			array[i] = i;
		}
		for (int i : array) {
			System.out.print(i+",");
		}
	}
	

	
}


