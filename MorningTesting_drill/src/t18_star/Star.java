package t18_star;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starPrint(5);
		starPrint(6);
		starPrint(7);
		starPrint(8);
	}
	public static void starPrint(int layer) {
		System.out.println("-");
		for(int i=0; i<layer; i++) {
			//for(int j=0; j<=8; j++) {
			for(int j=0; j<=(layer-1)*2; j++) {
				//if((j>=4-i)&& (j<=4+i))
				if((j>=(layer-1)-i)&& (j<=(layer-1)+i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
