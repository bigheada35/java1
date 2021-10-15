
public class PostfixOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int num2 = 2;
		System.out.print((num++) + " ");
		System.out.print((num++) + " ");
		System.out.print( num + "\n");
		System.out.print( num2++ + "------" + num2 + "/");
		
		System.out.print((num--) + " ");
		System.out.print((num--) + " ");
		System.out.print(num);
	}

}
