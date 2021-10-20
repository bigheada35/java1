import java.util.Arrays;

public class EArray15_for_each {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6};
		
		for (int i : ar) {
			System.out.println(i);
		}
		System.out.println("--1--");
		char[] ch = { 'c', 'b', 'a'};
		for(char c : ch)
			System.out.println(c);
		
		System.out.println("--2--");
		
		for(int e : ar) {
			System.out.print( e + " ");
		}
		System.out.println();
		System.out.println("--3--");
		int sum = 0;
		for( int k : ar) {
			sum += k;
		}
		System.out.println(sum);
		
	}
	

	
	
}





