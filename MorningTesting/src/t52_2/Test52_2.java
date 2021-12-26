package t52_2;

import java.util.HashSet;
import java.util.Objects;

class Num{
	private int num;

	public Num() {

	}

	public Num(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "Num [num=" + num + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("--3--");
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("--0--");
			return true;
		}
		if (obj == null) {
			System.out.println("--1--");
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("--2--");	
			return false;
		}
		Num other = (Num) obj;
		return num == other.num;
	}
	
	
}



public class Test52_2 {

	public static void main(String[] args) {
	       HashSet<Num> set = new HashSet<>();
	        set.add(new Num(7799));
	        set.add(new Num(9955));
	        set.add(new Num(7799));

	        System.out.println("인스턴스 수: " + set.size());

	        for(Num n : set)
	            System.out.print(n.toString() + '\t');

	        System.out.println();
	}

}
