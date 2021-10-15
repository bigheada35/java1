

public class MornigTest2 {

	public static void main(String[] args) {
		
		{
			/*
			 * 
					    *
					   **
					  ***
					 ****
					*****
					
					찍기
			 * 
			 * 
			 */
			for(int i=1; i<=5 ; i++) {
				for(int j=1; j<=5; j++) {
					if(j> (5-i)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		
		}
		System.out.println("---2--");
		{
			
			/*
				찍기

				*****
				 ****
				  ***
				   **
				    *

			 * 
			 */
			for(int i=1; i<=5 ; i++) {
				for(int j=1; j<=5; j++) {
					if(j>= (i)) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println(  "---" + 125_000);
			
		}
		
		
		{
			//선생님 별 산 찍기 
			
		}
		
	}

}
