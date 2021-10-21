package A3;

class SuperCLS{
	//
	//	static 의 저장 위치 : static 메모리 (객체 안이 아님을 의미)
	//
	static int count = 0;
	
	public SuperCLS() {
		System.out.println("Super");
		count++;
	}
}

class SubCLS extends SuperCLS{
	public void showCount() {
		System.out.println("sub" + count);
	}
}


public class A3SuperSubCon_static {

	public static void main(String[] args) {
		SuperCLS obj1 = new SuperCLS();
		SuperCLS obj2 = new SuperCLS();
		
		SubCLS obj3 = new SubCLS();
		obj3.showCount();
	}

}



