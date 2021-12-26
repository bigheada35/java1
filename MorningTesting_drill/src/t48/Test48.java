package t48;

import java.util.ArrayList;

public class Test48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			alist.add(i);
		}
		//System.out.println(alist.iterator());
		for(int i=0; i< alist.size(); i++) {
			System.out.println(alist.get(i));
		}
			
	}

}
