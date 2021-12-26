package t50;

public class Test50 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a + ", " + b);
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println(a + ", " + b);
		
		int[] array = new int[10];
		int c = 0;
		for (int i : array) {
			i = c++;
		}
		for(int i=0; i<10;i++)
		{
			
					System.out.println(array[i] + ", ");
		}
		

	}

}
