
public class For99EvenDan2PrintColume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for(int i=2;i<10;i+=2) {
		for(int j=1;j<10;j++) {//짝수단만 가로로 출력하기
			
			//for(int j=0;j<10;j++)
			for(int i=2;i<10;i+=2) {//짝수단만 가로로 출력하기
				//System.out.println(i + " x " + j + " = " + (i *j));
				System.out.print(i + " x " + j + " = " + (i *j) +"\t ");//짝수단만 가로로 출력하기
			}
			
			System.out.println("");//짝수단만 가로로 출력하기
		}
	}

}
