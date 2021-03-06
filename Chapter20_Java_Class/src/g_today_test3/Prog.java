package g_today_test3;
import java.util.Arrays;

public class Prog {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		
		ar[0] = new Person("Lee12", 29);
		ar[1] = new Person("Goo1234", 15);
		ar[2] = new Person("Soo55553",37);
		
		for (Person person : ar) {
			System.out.println(person);
		}
		System.out.println();
		Arrays.sort(ar);
		for (Person person : ar) {
			System.out.println(person);
		}		
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
		//return (this.name.compareTo(person.name));
		//return (this.name.length() - person.name.length());
		return (person.name.length() - this.name.length());
	}
	@Override
	public String toString() {
		return (this.name + "," + this.age); 
	}
}
/*
결과: 
	Lee1234,29
	Goo12,15
	Soo3,37
	
	Lee1234,29
	Goo12,15
	Soo3,37


 */

/*
//2. 아래에서 정렬이 이름 순으로 되게끔 하시오. Person 객체를 만드시오.
  3.위의 문제에서 사람의 이름 글자 수가 많은 순으로 정렬을 되게끔 person 객체를 만드시오.

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

