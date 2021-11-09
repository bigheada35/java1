package t34;

public class Test34 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();

	}
}

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int color;
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	void printProperty(){
		System.out.println(super.getSize() + "인치" + this.color + "컬러");
	}
}

//다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
//다음 TV 클래스가 있다.
//
//32인치 1024컬러
//