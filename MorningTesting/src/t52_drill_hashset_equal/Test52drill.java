package t52_drill_hashset_equal;

import java.util.HashSet;
import java.util.Objects;

class Num{
	private int num;

	public Num(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num other = (Num) obj;
		return num == other.num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
}

public class Test52drill {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));
		System.out.println("인스턴스 수:" + set.size());
		for(Num n : set)
			System.out.println(n.toString() + ", ");
		System.out.println();

	}

}
