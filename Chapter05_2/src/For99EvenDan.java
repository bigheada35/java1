
public class For99EvenDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//짝수단만 찍기
		
		//비추
//		
//		for(int i=2;i<10;i+=2) {//짝수단만 찍기
//			for(int j=0;j<10;j++)
//				System.out.println(i + " x " + j + " = " + (i *j));
//		}
		
		//강추
		for(int i=2;i<10;i++) {
			if(i%2 != 0) {
				continue;//짝수단만 찍기
			}
			for(int j=1;j<10;j++)
				System.out.println(i + " x " + j + " = " + (i *j));
		}		
		
	}

}
