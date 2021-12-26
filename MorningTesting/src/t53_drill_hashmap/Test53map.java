package t53_drill_hashmap;

import java.util.HashMap;
import java.util.Set;

public class Test53map {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45,"Brown");
		map.put(37, "James");
		map.put(23,"Martin");

		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			String name = map.get(i);
			System.out.println(i + ", " + name );
		}
	}

}
