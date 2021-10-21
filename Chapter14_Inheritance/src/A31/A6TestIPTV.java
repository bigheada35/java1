package A31;

/*
다음 TV 클래스가 있다.

class TV{
   private int size;
   public TV(int size) { this.size = size; }
   protected int getSize() { return size; }
}

[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.

public static void main(String[] args) {
   ColorTV myTV = new ColorTV(32, 1024);
   myTV.printProperty();
}

===========
32인치 1024컬러


//[2번] 다음 main() 메소드와 실행 결과를 참고하여 
//ColorTV를 상속받는 IPTV 클래스를 작성하라.
//192.1.1.2 주소에 32인치, 2048컬러
public static void main(String[] args) {
   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
   
   iptv.printProperty();
}



*/




public class A6TestIPTV {

	public static void main(String[] args) {
		//ColorTV myTV = new ColorTV(32, 1024);
		//myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		iptv.printProperty();
		
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
	protected int getColor() {
		return this.color;
	}
	void printProperty(){
		System.out.println(getSize() + "인치 " + this.color + "컬러");
	}
}
 
class IPTV extends ColorTV{
	private String ip;
	IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	
	void printProperty(){
		//192.1.1.2 주소에 32인치, 2048컬러
		//
		//	할아버지 꺼 super.getSize (인치) 도  호출 가능
		//	부모꺼  super.getColor (컬러) 호출가능 
		//
		System.out.println(this.ip + " 주소에 "+ super.getSize() + "인치, " + super.getColor() + "컬러");
	}
}
 



