package t_today_test8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Test8 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		//로또 번호6개를 출력 -중복없이
		//Set 으로 구현 과
		//일반 for 문 구현을 따로 하시오.
		while(true) {
			int num = (int)(Math.random()*45+1);
			//int num = (int)(Math.random()*8+1);
			set.add(num);
			System.out.println(num);
			if(set.size()==6)
				break;
		}
		Iterator<Integer> ite = set.iterator();
		for( ; ite.hasNext(); ) {
			System.out.print(ite.next() + ", ");
		}
	}

}

