
public class Star01Print6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		 *    
		//	    ***   
		//	   *****  
		//	  ******* 
		//	 *********
		
		//for (int i = 0; i < 5; i++) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 10; j++) {
				//if ( (j > (4-i)) && (j < (4+i))) {
				if ( (j > (5-i)) && (j < (5+i))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
