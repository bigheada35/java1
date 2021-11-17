package t27;

import java.util.Scanner;

public class Test27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[4];
		char[] arr2 = new char[4];
		String str = sc.next();
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
		System.out.println();
		int j=0;
		for(int i=arr.length -1;  i>= 0 ; i--) {
			arr2[j++] = arr[i];
		}
		System.out.println(arr2);
	}

}


