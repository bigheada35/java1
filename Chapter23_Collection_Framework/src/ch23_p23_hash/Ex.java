package ch23_p23_hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Ex {
	
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

class Car {
	private String model;
	private String color;
	// . . . .

	@Override
	public int hashCode() {
		return (model.hashCode() + color.hashCode()) / 2;
	}
	// . . . .
}


class Num extends Object {
	private int num;

	public Num(int n) {
		num = n;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	// 질문 : 여길 막아도 인스턴스 수 : 2 가 나와야 하는데 ,  3이 나옴. 이상함.
	@Override
	public int hashCode() {
		return num % 3; // num의 값이 같으면 부류도 같다.
	}

	// 주의 : 여기를 막으면  인스턴스 수가 3가 나온다.
	@Override
	public boolean equals(Object obj) { // num의 값이 같으면 true 반환
		if (num == ((Num) obj).num)
			return true;
		else
			return false;
	}
}
