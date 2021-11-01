package ch21_p14;

public class TestGen {
	//기본 자료형에 대한 제한 그리고 래퍼 클래스

	public static void main(String[] args) {
		
		//   → 타입 인자로 기본 자료형이 올 수 없으므로 컴파일 오류 발생
		//Box<int> box = new Box<int>(); // <--사용불가

	      Box<Integer> iBox = new Box<Integer>();
	      iBox.set(125);   // 오토 박싱 진행
	      int num = iBox.get();   // 오토 언박싱 진행
	      System.out.println(num);

	}
}

class Box<T> {
	   private T ob;

	   public void set(T o) { 
	      ob = o;
	   }
	   public T get() {
	      return ob;
	   }
	}
