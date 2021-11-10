package t52;

import java.util.HashSet;

public class Test52 {
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

class Num{
	private int num;
	Num(int n){
		this.num = n;
	}
	
	@Override
	public int hashCode() {
		return num%10;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Num) {
			Num n = (Num)o;
			if(this.num == n.num)
				return true;
			else
				return false;
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return (String.valueOf(this.num));
	}
}
/*
 결과
 인스턴스 수: 2
9955	7799	

 
*/


/*
아래와 같이 출력이 나오도록 프로그래밍을 하시오.

       HashSet<Num> set = new HashSet<>();
       set.add(new Num(7799));
       set.add(new Num(9955));
       set.add(new Num(7799));

       System.out.println("인스턴스 수: " + set.size());

       for(Num n : set)
           System.out.print(n.toString() + '\t');

       System.out.println();


====출력
인스턴스 수: 2
7799        9955
*/
