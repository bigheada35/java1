package t27;

import java.util.Scanner;

public class t27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] array = new char[4];
		char[] arrayb = new char[4];
		
		String str = sc.next();
		System.out.println(str);
		for(int i=0; i<array.length;i++) {
			array[i] = str.charAt(i);
			System.out.println(array[i]);
		}
		int j=0;
		for(int i=array.length-1; i>=0; i--) {
			arrayb[i] = array[j++];
		}
//		for(int i=0; i<arrayb.length; i++) {
//			System.out.println(arrayb[i]);
//		}
		for (char c : arrayb) {
			System.out.println(c);
		}
		
	}

}

/*

*/



