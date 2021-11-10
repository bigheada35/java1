package t33;


public class Test33 {
	public static void main(String[] args) {
		int[][] array = new int[4][3];
		
		for(int i = 0 ; i< 4 ; i++) {
			
			for(int j = 0; j< 3; j++) {
				//array[i][j] = j; 
				//array[i][j] = (int)(Math.random(10) +1);
				array[i][j] = (int)(Math.random()*10 +1);
			}
		}
		
		for(int i = 0 ; i< 4 ; i++) {
			
			for(int j = 0; j< 3; j++) {
				System.out.print(array[i][j] + ","); 
			}
			System.out.println();
		}

		
		
		
	}
}

/*
 2차원 배열 4 * 3 을 선언하고,
각각의 방을 랜덤으로 값을 넣은뒤
모두 출력하시오.
*/