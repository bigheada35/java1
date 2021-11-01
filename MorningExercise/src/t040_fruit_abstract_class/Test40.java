package t040_fruit_abstract_class;
/*
 7.과일, 사과, 배, 포도를 표현한 클래스를 만들고 이들 간의 
관계를 고려하여 하나의 클래스를 추상 클래스로 만들어 
메소드 print()를 구현하고 
다음과 같은 소스와 결과가 나오도록 클래스를 작성하시오.
- 소스
Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
for(Fruit f : fAry)
f.print();

- 결과
나는 포도이다.
나는 사과이다.
나는 배이다.
 */
//비교 : 인터페이스는 추상메소드만 들어가야 하는데 비해 (물론 상수도 가능)
//		추상클래스는 일반함수도 들어 갈수 있다.
abstract class Fruit{
	public abstract void print();
	public void print2() {
		System.out.println("일반함수도 들어간다. 추상클래스에는");
	}
}
class Grape extends Fruit{
	@Override
	public void print() {
		System.out.println("나는 포도이다.");
	}
}
class Apple extends Fruit{
	@Override
	public void print() {
		System.out.println("나는 사과이다.");
	}
}
class Pear extends Fruit{
	@Override
	public void print() {
		System.out.println("나는 배이다.");
	}
}
public class Test40 {

	public static void main(String[] args) {
		
		//Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
		//이것이 보기 더 좋다.
		Fruit[] fAry = {new Grape(), new Apple(), new Pear()};
		for(Fruit f : fAry)
			f.print();
	}
}

