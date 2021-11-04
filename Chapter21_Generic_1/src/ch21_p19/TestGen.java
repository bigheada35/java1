package ch21_p19;
public class TestGen {
 
	public static void main(String[] args) {
		Box<Integer> Box = new Box<>();
		

	}
}



class Box<T extends Number> {
	   private T ob;
	   public int toIntValue() {
	      return ob.intValue();   // OK!
	   }
	}