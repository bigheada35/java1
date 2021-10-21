
public class A2SuperSubCon {
	//
	//
	//
	public static void main(String[] args) {
		//  sub 호출시
		//  호출 순서 :  부모 생성자  -> sub 생성자 
		new SubCLS();
	}

}

class SuperCLS{
	public SuperCLS() {
		System.out.println("Super");
	}
}

class SubCLS extends SuperCLS{
	public SubCLS() {
		System.out.println("sub");
	}
}


