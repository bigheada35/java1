import java.util.Arrays;

public class EArray13_Fill_Copy {

	public static void main(String[] args) {
		
		//--------------------
		//int[] ar1 = new int[10];
		//Arrays.fill( ar1, 7);
		
		//--------------------
		int[] ar1 = { 1, 2, 3, 4, 5, 6, 7};
		int[] ar2 = new int[10];
		
		//System.arraycopy(ar1, 0, ar2, 3, 4); //  src, index --> dest ( index, size )
		//System.arraycopy(ar1, 2, ar2, 3, 4);
		System.arraycopy(ar1, 2, ar2, 3, 3);
		//System.arraycopy(ar1, 2, ar2, 7, 4); /// 에러 발생
		
		for(int i=0; i< ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i< ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
		
		
		
	}
	

	
	
}





