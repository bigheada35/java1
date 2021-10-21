import java.util.Arrays;

public class EArray20_Array2d {

	public static void main(String[] args) {
		
		int[][]arr = {
				//
				// 주의 : {11},  <- 1개 가능, 
				//			arr[0] 이 참조( new 사용? ) 이고,  
				//			arr[0] 과 arr[1]은 메모리가 비연속적이므로
				//
				{11},
				{22, 33},
				{44, 55, 66}
		};
		
		for(int i=0; i<arr.length; i++) {
			//
			// 주의 :  arr[i].length 임
			//
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}








