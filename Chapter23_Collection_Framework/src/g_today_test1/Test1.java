package g_today_test1;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		//Set<Person> hSet = new HashSet<Person>();
		
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));
		
		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
	}

}

class Person{
	private String name;
	private int age;
	Person(String n, int a){
		this.name = n;
		this.age = a;
	}
	// 주의 : hashCode를 오버라이딩 안하면 HashSet에 중복된 값이 입력이 된다. 
	public int hashCode() {
		return  age/10;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p = (Person) o;
			if(this.name.equals(p.name))
				return true;
			else 
				return false;
			
		}
		return false;
	}
	@Override
	public String toString() {
		return ( this.name + "(" + this.age + ")");
	}
}

/*

아래의 출력이 나오도록 만드시오.
  저장된 데이터 수: 2
[LEE(10세), PARK(35세)]

*/


