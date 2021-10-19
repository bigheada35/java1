
public class AArray2 {

	public static void main(String[] args) {
		Box[] ar = new Box[5];
		System.out.println("length : " + ar.length);
		System.out.println("ar : " + ar);
		
		for(int i=0; i<5; i++) {
			//System.out.println(ar[i]);
			//System.out.println(ar[i].length);
			int tmp = i;
//			ar[i] = new Box(tmp.toString(i));
		}
		System.out.println(ar.length);
		
	}
}


class Box{
	private String conts;
	Box(String cont){	this.conts = cont;	}
	public String toString() {
		return conts;
	}
}
