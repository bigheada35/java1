
public class AOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch1 = 'k';
		char ch2 = 'k';
		
		simple(1,ch1);
		simple(2,ch2);
	}

	
	static void simple ( int a, int b)
	{
		System.out.println("11  " + b);
	}
	static void simple ( int a, double b)
	{
		System.out.println("2  " + b);
	}
//	static int simple ( int a, double b)
//	{
//		System.out.println("2  " + b);
//	}	
}
