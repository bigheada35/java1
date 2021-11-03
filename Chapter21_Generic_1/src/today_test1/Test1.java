package today_test1;
public class Test1 {
	public static void main(String[] args) {

		Box obox = new Box();
		Box abox = new Box();
		Box abox2 = new Box();
				
		obox.set(new Orange());
		abox.set(new Apple());
		abox2.set("Apple");			// <--(1)
		
		Orange org = (Orange)obox.get(); 
		Apple app = (Apple)abox.get();
		//Apple err = (Apple)abox2.get();
		
		System.out.println(org);
		System.out.println(app);
		System.out.println(abox2);
		
	}
}
class Box{
	private Object obj;
	void set(Object obj){
		this.obj = obj;
	}

	Object get() {
		return obj;
	}
	@Override
	public String toString() {
		return (obj.toString());
	}
	
}
class Orange{
	private String name;
	@Override
	public String toString() {
		return "I am Orange";
	}
}
class Apple{
	private String name;
	@Override
	public String toString() {
		return "I am Apple";
	}
}


/* 결과:

*/

/*
Generic 이전의 코드의 문제 상황들을 예시로 설명하시오.
*/