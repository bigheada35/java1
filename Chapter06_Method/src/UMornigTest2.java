
public class UMornigTest2 {

	public static void main(String[] args) {
/*
 아래를 함수로 만드시오.

starPrint3(5) 

출력
   
    *   
   ***
  *****
 *******
*********

 */
		starPrint3(5);
	}
	
	public static void starPrint3(int num) {
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<9; j++) {
				if(j>=(4-i) && j<=(4+i)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


	







	
}
