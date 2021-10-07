
public class CompAssignOp {

	public static void main(String[] args) {
		//
		short num = 10;
		
		num = (short)(num +77L);//형변환 안하면 컴파일 오류 발생
		//num = (num +77L);
		
		int rate = 3;
		rate = (int)(rate * 3.5);//형 변환 안하면 컴파일 오류 발생
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;	//형 변환 필요하지 않다. //이유 ? 
		rate = 2;
		rate *= 3.5; //형 변환 필요 하지 않다.  // 이유?
		System.out.println(num);
		System.out.println(rate);
	}

}
