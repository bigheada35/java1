package t50_2;

public class Test50_2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println( a + ", " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println( a + ", " + b);
				
		//int[] arr = new arr[](3,4,5,6, 10);
		
		//int[] arr = {3,4,5,6, 10};
		int[] arr = {3,4,10,6,5};
		//int[] arr = {3,4,5,6, 10};
		
		int max = 3;
		for(int i =0 ; i<5; i++)
		{
			
				
				if( max< arr[i]) {
					max = arr[i];
				}
	
			
		}
		System.out.println("max " +  max);

	}

}
