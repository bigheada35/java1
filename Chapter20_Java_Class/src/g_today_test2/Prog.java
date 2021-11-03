package g_today_test2;
import java.util.Arrays;
public class Prog {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee", 29);
		ar[1] = new Person("Goo", 15);
		ar[2] = new Person("Soo", 37);

//		for (Person person : ar) {
//			System.out.println(person);
//		}
		System.out.println(Arrays.toString(ar));
		
		System.out.println();
		Arrays.sort(ar);
		
//		for (Person person : ar) {
//			System.out.println(person);
//		}
		// 주의 : Arrays.toString(ar) 사용하기
		System.out.println(Arrays.toString(ar));
		
	}
}
class Person implements Comparable{
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object obj) {
		Person person = (Person)obj;
		return (this.name.compareTo(person.name));
	}
	@Override
	public String toString() {
		//return (this.name + "," + this.age); 
		return (this.name + ":" + this.age);
	}
}
/*
결과: 
//	Lee,29
//	Goo,15
//	Soo,37
//	
//	Goo,15
//	Lee,29
//	Soo,37

[Lee:29, Goo:15, Soo:37]

[Goo:15, Lee:29, Soo:37]

 */

/*
2. 아래에서 정렬이 이름 순으로 되게끔 하시오. Person 객체를 만드시오.

class ArrayObjSearch {
	public static void main(String[] args) {

		Person[] ar = new Person[3];    
		ar[0] = new Person("Lee", 29);
    	ar[1] = new Person("Goo", 15);
    	ar[2] = new Person("Soo", 37);

    Arrays.sort(ar);
	}
}
 */

