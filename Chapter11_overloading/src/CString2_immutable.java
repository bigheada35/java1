
public class CString2_immutable {

	public static void main(String[] args) {

		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		
		if(str1 == str2) 
			System.out.println("1"); /// 정답
		else
			System.out.println("2");
		
		if(str3 == str4)
			System.out.println("3");
		else
			System.out.println("4"); /// 정답
		
		
		String str5 = str1 + str2; 
		System.out.println("str5:" + str5);
		
		//주소를 찍어 볼수 있는 방법 은?
		//int addr1 = (int)str1;
		//int sddr2 = (int)str2;
		//System.out.println(addr1);
		//System.out.println(addr1);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		
		
		
	}


	
	
	
}	