package c17_p08_printer_driver;

interface Printable { // MS가 정의하고 제공한 인터페이스

	// 인터페이스에 선언되는 메소드와 변수
	public static final int PAPER_WIDTH = 70;
	public static final int PAPER_HEIGHT = 120;

	public void print(String doc);
}

class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
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
	}

}
