package ch20_p36_compareTo_override_2;
import java.util.Arrays; //<-- ***

//배열에 저장된 인스턴스들의 정렬의 예

public class Prog {
	public static void main(String[] args) {
		//배열에 저장된 인스턴스들의 정렬의 예

		   Person[] ar = new Person[3];
		   ar[0] = new Person("Lee1234", 29);
		   ar[1] = new Person("Goo12", 15);
		   ar[2] = new Person("Soo3", 37);
		   
		   for(Person p : ar)
			      System.out.println("=="+p);
		   
		   Arrays.sort(ar);
		   
		   for(Person p : ar)
		      System.out.println("---" + p);

/*
Lee: 29
Goo: 15
Soo: 37
---Goo: 15
---Lee: 29
---Soo: 37

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

	   //배열에 저장된 인스턴스들의 정렬의 예
	   @Override
	   public int compareTo(Object o) {  //<--- ***
	      Person p = (Person)o;
	      
//	      if(this.age > p.age)
//	         return 1;    // 인자로 전달된 o가 작다면 양의 정수 반환
//	      else if(this.age < p.age)
//	         return -1;    // 인자로 전달된 o가 크다면 음의 정수 반환
//	      else
//	         return 0;    // 인자로 전달된 o와 같다면 0을 반환
	      
	      
	     // return this.age - p.age;	//오름차순 
	      	/*
	      	 Goo: 15
			Lee: 29
			Soo: 37
	      	 */
	     // return p.age - this.age;		//내림차순
	      /*
	       Soo: 37
			Lee: 29
			Goo: 15

	       */

	      // 이름의 갯수의 오름 차순으로 정렬 하기.
	      return ((this.name.length()) - (p.name.length()));
	      
	   }
	   @Override
	   public String toString() {
		      return name + ": " + age;
		   }


	}