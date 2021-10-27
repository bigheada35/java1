package c17_p09_printer_if_;

interface Printable { // MS가 정의하고 제공한 인터페이스

	// 인터페이스에 선언되는 메소드와 변수
	public static final int PAPER_WIDTH = 70;
	public static final int PAPER_HEIGHT = 120;

	public void print(String doc);
	//void printCMYK(String doc);
	//
	//컬러 출력 위한 메소드 추가되면?
	//시스템 전체에 문제 발생  -- > 다른 대안 필요함.  (대안) :  extends
	//

}
//
// 주의 : 인터페이스가 바뀌어야 할때 방법, --> 인터페이스의 상속
// 주의 : 인터페이스간 상속도 extends로 표현
interface ColorPrintable extends Printable {
	   void printCMYK(String doc);
	}


class Prn909Drv implements ColorPrintable {
	   @Override
	   public void print(String doc) {   // 흑백 출력
	      System.out.println("black & white ver");
	      System.out.println(doc);
	   }
	   
	   @Override
	   public void printCMYK(String doc) {   // 컬러 출력
	      System.out.println("CMYK ver");
	      System.out.println(doc);
	   }
	}



class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
	//인터페이스를 구현하는 클래스는 
	//해당 인터페이스의 모든 추상 메소드를 
	//구현해야 한다. 그래야 인스턴스 생성 가능!
	
	// 주의 : public 아니면 error
	//void printCMYK(String doc) {
	// 주의 : interface에는 printCMYK 가 있는데, 구현을 안하면, error 발생함.
	//public void printCMYK(String doc) {
	//	System.out.println("11 printCMYK");
	//}
	
}

class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		//
		// 주의 : PAPER_WIDTH 접근 가능
		//
		System.out.println(PAPER_WIDTH);
		
		System.out.println(doc);
	}
	//인터페이스를 구현하는 클래스는 
	//해당 인터페이스의 모든 추상 메소드를 
	//구현해야 한다. 그래야 인스턴스 생성 가능!
	
	// 주의 : public 아니면 error
	//void printCMYK(String doc) {
	// 주의 : interface에는 printCMYK 가 있는데, 구현을 안하면, error 발생함.
	//public void printCMYK(String doc) {
	//	System.out.println("22 printCMYK");
	//}
	
}

public class Test1 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// LG 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);
		
		//test
		System.out.println("--");
		//신규 컬러 프린터, Prn909Drv
		ColorPrintable prn2 = new Prn909Drv();
		prn2.print(myDoc);
		prn2.printCMYK(myDoc);
	}

}
