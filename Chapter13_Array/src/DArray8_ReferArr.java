

public class DArray8_ReferArr {

	public static void main(String[] args) {
		Box2[] ar = new Box2[3];
		
		//배열에 인스턴스 저장
		ar[0] = new Box2("First");
		ar[1] = new Box2("Second");
		ar[2] = new Box2("Third");
		
		//저장된 인스턴스의 참조
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		//test
		/*
		 	3
			1392425346
			ar:[LBox2;@52feb982
			2054574951
			ar[0]:First
			1991294891
		 */
		System.out.println(ar.length);
		System.out.println(System.identityHashCode(ar));
		System.out.println("ar:" + ar);
		System.out.println(System.identityHashCode(ar[0]));
		System.out.println("ar[0]:" + ar[0]);
		System.out.println(System.identityHashCode(ar[1]));
		
	}
}

class Box2{
	private String conts;
	Box2(String cont){
		this.conts = cont;
	}
	
	public String toString() {
		return conts;
	}
	
	
}



