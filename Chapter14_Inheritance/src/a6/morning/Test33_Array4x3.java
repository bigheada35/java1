/*
 * 
 2차원 배열 4 * 3 을 선언하고,
각각의 방을 랜덤으로 값을 넣은뒤
모두 출력하시오.
 */

package a6.morning;

public class Test33_Array4x3 {

	public static void main(String[] args) {
		Array ar = new Array();
		System.out.println("---");
		ar.show();
	}

}

class Array{
	private int[][] arr = new int[4][3];
	Array() {
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = (int)(Math.random()*10 + 1);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	void show(){
		//for (int[] is : arr) {
		//	System.out.println(is + " ");
		//}
		System.out.println("---");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3 ; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	
}