
public class Star01Print7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		 *    
		//	    ***   
		//	   *****  
		//	  ******* 
		//	 *********
		
		//for (int i = 1; i < 6; i++) {
		for (int i = 1; i < 12; i++) {
			for (int j = 1; j < 10; j++) {
				if ( (j > (5-i)) && (j < (5+i))) {
				//if ( (j > ((5-i>=0)?(5-i):(i-5))) && (j < ((5+i<6)?(5+i):(i-5)))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
