
public class TTodayTest {

	public static void main(String[] args) {
		System.out.println("---4---");
		/*

*****
 ****
  ***
   **
    *

		 */
		starPrint2(5);
		
		
		System.out.println("---5---");
		starPrint3(5);
		
		
	}
	
	public static void starPrint3(int row) {
		for(int i=0; i< row ; i++) {
			for(int j=1; j<=9 ; j++) {
				if( (j >= 5-i) && ( j<= 5+i )) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
	
	public static void starPrint2(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=5; j++) {
				if(j>=i) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

	
}
