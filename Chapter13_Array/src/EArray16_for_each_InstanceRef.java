import java.util.Arrays;

public class EArray16_for_each_InstanceRef {

	public static void main(String[] args) {
		Box3[] ar = new Box3[5];
		ar[0] = new Box3(101, "Coffee");
		ar[1] = new Box3(202, "Computer");
		ar[2] = new Box3(303, "Apple");
		ar[3] = new Box3(404, "Dress");
		ar[4] = new Box3(505, "Fairy-tale book");
		
		for(Box3 i : ar) {
			if(i.getBoxNum() == 505) 
				System.out.println(i);
		}
		
		
	}
}

class Box3{
	private int n;
	private String str;
	
	Box3(int n, String str){
		this.n = n;
		this.str = str;
	}
	int getBoxNum() {
		return n;
	}
	public String toString(){
		//System.out.println(str);
		return str;
	}
}






