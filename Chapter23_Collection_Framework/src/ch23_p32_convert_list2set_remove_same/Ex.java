package ch23_p32_convert_list2set_remove_same;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Ex {
	
    public static void main(String[] args) {
    	List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
    	ArrayList<String> list = new ArrayList<>(lst);
    	
    	for (String s : list) {
			System.out.print(s.toString() + ",");
		}
    	System.out.println();
    	
    	//convert -- list에있던 중복되어 있던 것을 Hash로 바꿔서 중복된 것을 제거 하다.
        HashSet<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        for(String s : list)
            System.out.print(s.toString() + ",");
        System.out.println();
    	
    }

    
}
