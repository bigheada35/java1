package g_today_test2_teacher;
import java.util.Arrays;

class Person implements Comparable{
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
        Person p = (Person)o;
        //lexicographically
        return p.name.compareTo(this.name)   ;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

}
public class Prog {
	public static void main(String[] args) {
		Person[] ar = new Person[3];

		ar[0] = new Person("Lee1234", 29);
		ar[1] = new Person("Goo12", 15);
		ar[2] = new Person("Soo3", 37);

		Arrays.sort(ar);

		System.out.println(Arrays.toString(ar));
		
	}
}
/*
결과: 
			[Soo3: 37, Lee1234: 29, Goo12: 15]
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

