
public class TodayTest2 {

	public static void main(String[] args) {
		
		{
			System.out.println("--그냥해보기--");	
			/*
			 * 그냥해보기.아래의 별을 찍으시오.
	
				    *
				   ***
				  *****
				 *******
				*********
			 */
			for(int i=0; i<5; i++) {
				for(int j=0; j<9; j++) {
					if((j>= 4-i) && (j <= 4+i) ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}			
		}
		{
			System.out.println("--그냥해보기2--");	
			for(int i = 1; i <= 5; i++) {
				for(int j = 4; j >= i; j--) {
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
		
		
	}

}
