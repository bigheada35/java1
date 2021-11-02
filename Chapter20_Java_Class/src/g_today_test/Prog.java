package g_today_test;
import java.util.Arrays;
public class Prog {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee1234", 29);
		ar[1] = new Person("Goo12", 15);
		ar[2] = new Person("Soo3",37);
		for (Person person : ar) {
			System.out.println("1-- "+ person);
		}
		System.out.println();
		Arrays.sort(ar);
		
		for (Person person : ar) {
			System.out.println("2-- "+person);
		}		
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
		return this.name.compareTo(person.name); 
	}
	@Override
	public String toString() {
		return ( name +"," + age);
	}
}

/*
결과 : 
	1-- Lee1234,29
	1-- Goo12,15
	1-- Soo3,37
	
	2-- Goo12,15
	2-- Lee1234,29
	2-- Soo3,37
	[Goo12,15, Lee1234,29, Soo3,37]

 */

