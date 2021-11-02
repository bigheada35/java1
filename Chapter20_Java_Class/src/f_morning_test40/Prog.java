package f_morning_test40;


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

public class Prog {
	public static void main(String[] args) {
		Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
		for(Fruit f : fAry)
			f.print();
	}
}

abstract class Fruit{
	public abstract void print();
}
//주의 : abstract class라서, extends 사용..
//주의 : interface가 implements 임.
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


/*
 결과:

 */
