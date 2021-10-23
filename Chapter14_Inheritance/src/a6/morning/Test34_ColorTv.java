/*
 class TV{
   private int size;
   public TV(int size) { this.size = size; }
   protected int getSize() { return size; }
}



public static void main(String[] args) {
   ColorTV myTV = new ColorTV(32, 1024);
   myTV.printProperty();
}

32인치 1024컬러
 */

package a6.morning;

public class Test34_ColorTv {

	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
	}

}

class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() { return size; }
}

class ColorTV extends TV{
	private int color;
	
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	void printProperty(){
		System.out.println(getSize() + "인치 " + this.color + "컬러");
	}
}


