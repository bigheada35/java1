package t42_test_21_11_03;

import java.util.Arrays;

public class Test42 {
	public static void main(String[] args) {
		   Person[] ar = new Person[3];
		   ar[0] = new Person("Lee", 29);
		   ar[1] = new Person("Goo", 15);
		   ar[2] = new Person("Soo", 37);

		   Arrays.sort(ar);
		   for(Person p : ar)
		      System.out.println(p);
	}

}
class Person implements Comparable{
	private String name;
	private int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object obj) {
		Person person = (Person)obj;
		return (this.age - person.age);
	}
	@Override
	public String toString() {
		return (this.name + "," + this.age);
	}
}
/*
결과:
	Goo,15
	Lee,29
	Soo,37
 	*/
/*
public static void main(String[] args) {
   Person[] ar = new Person[3];
   ar[0] = new Person("Lee", 29);
   ar[1] = new Person("Goo", 15);
   ar[2] = new Person("Soo", 37);

   Arrays.sort(ar);
   for(Person p : ar)
      System.out.println(p);
}
나이순 대로 정렬 하시오.

*/