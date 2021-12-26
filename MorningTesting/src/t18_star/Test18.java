package t18_star;

import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		
		starPrint3(5);
		starPrint3(6);
	}
	public static void starPrint3(int layer) {
		for(int i=0; i<layer ; i++) {
			for(int j=0; j<=(layer-1)*2 ; j++) {
				
				if( j>=((layer-1)-i) && j<=((layer-1)+i)) {
					System.out.print("*");
				}else
					System.out.print(" ");
				
				
			}
			System.out.println();
		}
	}

}






/*


*/