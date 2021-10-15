
public class EReculFactorial {

	public static void main(String[] args) {
		System.out.println("3 factorial : " + factorial(3));
		System.out.println("---");
		//System.out.println("12 factorial : " + factorial(12));
		System.out.println("6 factorial : " + factorial(6));
	}
	
	public static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return n * factorial(n-1);
	}
}
