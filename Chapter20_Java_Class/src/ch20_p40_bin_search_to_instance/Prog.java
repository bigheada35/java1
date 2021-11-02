package ch20_p40_bin_search_to_instance;
import java.util.Arrays; //<-- ***

//배열의 탐색: 인스턴스 대상

public class Prog {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		   ar[0] = new Person("Lee", 29);
		   ar[1] = new Person("Goo", 15);
		   ar[2] = new Person("Soo", 37);
		   
		   //탐색 대상들은 오름차순으로 정렬되어 있어야 한다  <-- ***
		   // ???  name 기준?. age 기준 ???
		   // ???  ===>   compareTo() 내용에 의해서 sort가 된다.
		   
		   for (Person person : ar) {
			   System.out.println("-- "+person);
		   }
		   
		   Arrays.sort(ar);   // 탐색에 앞서 정렬을 진행

		   for (Person person : ar) {
			   System.out.println("== "+person);
		   }		   
		   
		   //int idx = Arrays.binarySearch(ar, new Person("Who are you?", 37));
		   // ??????????????????????
		// ??????????????????????
		// ??????????????????????
		   int idx = Arrays.binarySearch(ar, new Person("Soo", 34));
		   
		   System.out.println(idx);
		   
		   System.out.println(ar[idx]);

/*

*/
	}
}

class Person implements Comparable {
	   private String name;
	   private int age;   

	   public Person(String name, int age) {
		      this.name = name;
		      this.age = age;
		   }  
	   @Override
	   public int compareTo(Object o) {
	      Person p = (Person)o;
	      return this.age - p.age;   // 나이가 같으면 0을 반환
	   }
	   @Override
	   public String toString() {
		   return ( name + " , " + age);
	   }
	}
