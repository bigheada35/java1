import java.util.Scanner;

public class PMorningTest27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//System.out.println(str);
		for(int i=0 ; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		for(int i=str.length()-1; i>=0 ;i--) {
			System.out.print(str.charAt(i));
		}
	}


	
	
	
}	