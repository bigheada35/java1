
public class gugudan {

	public static void printGugu(int endDan) {
		// TODO Auto-generated method stub
		for(int i=1; i<endDan; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "x" + j + "=" + (i*j) + ", ");	
			}
			System.out.println();
		}
		System.out.println();
	}

}
