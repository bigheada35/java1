
public class EArray12_ReturnArrayRef {

	public static void main(String[] args) {
		//int[] ar = {1,2,3,4,5,6,7};
		//System.out.println(sumOfAry(ar));
		
		//int[] ar = new int[5];
		int[] ar5 = makeNewIntAry(5);//new int[5];
		int[] ar6 = makeNewIntAry(6);//new int[6];
	}
	

	public static int[] makeNewIntAry(int len) {
		int[] ar = new int[len];
		return ar;
	}
	
}





