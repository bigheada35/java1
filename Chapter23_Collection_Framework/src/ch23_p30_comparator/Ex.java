package ch23_p30_comparator;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class Ex {
	
    public static void main(String[] args) {
 
        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
        tree.add(new Person("YOON", 37));
        tree.add(new Person("HONG", 53));
        tree.add(new Person("PARK", 22));
	
        for(Person p : tree)
            System.out.println(p);	
    	
    	
    }

    
}
class Person implements Comparable{
	//private String name;
	//private int age;
	String name;
	int age;
	
	public Person(String name, int age){
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

class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p2.age - p1.age; 
    }
}



