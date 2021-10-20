import java.util.Arrays;

public class EArray17_for_each_InstanceRef2 {

	public static void main(String[] args) {
		Box4[] ar = new Box4[5];
//		ar[0] = new Box4(101, "Coffee");
//		ar[1] = new Box4(202, "Computer");
//		ar[2] = new Box4(303, "Apple");
//		ar[3] = new Box4(404, "Dress");
//		ar[4] = new Box4(505, "Fairy-tale book");
		
		for(int i=0; i<ar.length; i++) {
			//ar[i] = new Box4(100*(i+1)+(i+1), String.valueOf(i));
			ar[i] = new Box4(100*(i+1)+(i+1), "str"+String.valueOf(i));
		}
		System.out.println("--sj-test");
		for(Box4 e : ar) { 
			System.out.println(e);
		}
		
		System.out.println("--");
		for(Box4 e : ar) {
			if(e.getBoxNum() == 505) 
				System.out.println(e);
		}
	}
}

class Box4{
	private int n;
	private String str;
	
	Box4(int n, String str){
		this.n = n;
		this.str = str;
	}
	int getBoxNum() {
		return n;
	}
	public String toString(){
		return str;
	}
}






