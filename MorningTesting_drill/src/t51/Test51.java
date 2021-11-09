package t51;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class Test51 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() != 6) {
			set.add((int)(Math.random()*45 + 1));
		}
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
	}
	
}
// 로또 번호를 Set을 활용하여 짜시오
