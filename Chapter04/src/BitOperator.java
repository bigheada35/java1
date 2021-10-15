
public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte n1 = 5;// 0101
		byte n2 = 3;// 				0011
		byte n3 = -1; // 0001, 1110, 1111
		
		byte r1 = (byte)(n1 & n2);
		byte r2 = (byte)(n1 | n2);
		byte r3 = (byte)(n1 ^ n2);
		byte r4 = (byte)(~n3);
		
		System.out.println(r1);
		//System.out.printf("%0b", r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
