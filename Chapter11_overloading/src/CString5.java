
public class CString5 {

	public static void main(String[] args) {
		//문자열 "123"이 저장된 인스턴스의 생성
		StringBuilder stbuf = new StringBuilder("123");
		
		stbuf.append(45678);  // --> 12345678
		System.out.println(stbuf.toString());
		
		stbuf.delete(0, 2);	//  i=0, i<2 까지 지움.--> 345678
		System.out.println(stbuf.toString()); 
		
		stbuf.replace( 0, 3, "AB"); // i=0, i<3 , --> AB678
		System.out.println(stbuf.toString());
		
		stbuf.reverse(); //문자열 내용 뒤집기--> 876BA
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2,4);//일부만 문자열로 반환 -->6B
		System.out.println(sub.toString());
	}


	
	
	
}	