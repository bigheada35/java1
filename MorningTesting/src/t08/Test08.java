package t08;


public class Test08 {
	public static void main(String[] args) {
		int i=11;
		System.out.println(i + "는 1보다 크면서, 100보다 작은가?");
		if( i>1 && i<100) {
			System.out.println("yes");
		}else
			System.out.println("no");
		
		 i=22;
		 System.out.println(i + " 는 2의 배수이면서, 3의 배수인가?");
		if( (i%2 == 0 )&& (i%3 ==0)  ) {
			System.out.println("yes");	
		}else
			System.out.println("no");
	}
	
	
}

