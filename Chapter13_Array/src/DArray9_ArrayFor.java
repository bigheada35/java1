

public class DArray9_ArrayFor {

	public static void main(String[] args) {
		//String[] sr = new String[7];
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
	at DArray9_ArrayFor.main(DArray9_ArrayFor.java:14)

		 */
		String[] sr = new String[8];
		
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Java");
		sr[4] = new String("Java");
		sr[5] = new String("Java");
		sr[6] = new String("Java");
		sr[7] = new String("Java");
		
		int cnum = 0;
		//
		//  주의 sr은 length이고
		//
		for(int i = 0; i < sr.length ; i++) {
			//
			// 주의 :  sr[i] 은  length() 이다.
			//
			cnum += sr[i].length();
		}
		System.out.println("총 문자의 수: " + cnum);
	}
}





