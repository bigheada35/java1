package ch21_p19;
public class TestGen {
 
	public static void main(String[] args) {
		Box<Apple> Box = new Box<>();
		Box.set(new Apple());
		System.out.println(Box.get());
/*
 결과:
 	It tastes so good!
	IamApple
 */
	}
}

interface Eatable { public String eat(); }
//제네릭 클래스의 타입 인자를 인터페이스로 제한하기
class Apple implements Eatable {
   public String eat() {
      return "It tastes so good!";
   }  
   @Override
   public String toString() {
	   return ("IamApple");
   }
}
//제네릭 클래스의 타입 인자를 인터페이스로 제한하기

class Box<T extends Eatable> {
	T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		System.out.println(ob.eat()); // Eatable로 제한하였기에 eat 호출 가능
		return ob;
	}
}
