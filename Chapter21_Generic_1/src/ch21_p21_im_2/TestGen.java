package ch21_p21_im_2;
public class TestGen {
	//제네릭 메소드의 정의
	public static void main(String[] args) {
		
		//Box<String> sBox = BoxFactory.makeBox("Sweet"); // 참고 :  생략 가능 , 
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		
		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
		
		System.out.println(sBox.get());
		System.out.println(dBox.get());
	}
}
//클래스 전부가 아닌 메소드 하나에 대해 제네릭으로 정의
class BoxFactory {
	public static <T> Box<T> makeBox(T o){
		
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}
class Box<T> { //주의 : 제네릭 클래스 명
	private T o;	// 주의 : 제네렉 클리스 안에서는 모두 T
	void set(T o) {
		this.o = o;
	}
	T get(){
		return this.o;
	}
}
/* 결과:

*/
