package ch23_p31_hash;

import java.util.HashSet;
//import java.util.Iterator;
//import java.util.TreeSet;

class Ex {
	
    public static void main(String[] args) {
    	HashSet<Person> hSet = new HashSet<Person>();
    	hSet.add(new Person("LEE", 10));	
    	hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));	
		
		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
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
	public int hashCode() {
		return age/10;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o instanceof Person) {  // 주의 : 넣어 주세요.
			Person p = (Person)o;
			if(p.name.equals(this.name) && this.age == p.age)
				return true;
			else
				return false;
		}
		return false;
		
//		Person p = (Person)o;
//		if(this.age == p.age && this.name.equals(p.name))
//			return true;
//		else 
//			return false;
	}
	
	@Override
	public String toString() {
		return (this.name +"("+ this.age + "세)");
	}
	
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		//return this.age - p.age;
		return p.age - this.age;
	}
}

/*
저장된 데이터 수: 2
[LEE(10세), PARK(35세)]
*/