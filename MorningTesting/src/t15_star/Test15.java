package t15_star;


public class Test15 {
	public static void main(String[] args) {
		
	
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j>=(4-i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}	
		
		
		
	}
}

