package t37;

public class Test37 {
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

interface Printable{
	public void print(String doc);
}
class SPrinterDriver implements Printable{
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
	
}
class LPrinterDriver implements Printable{
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}
/*
아래의 출력 값을 보고
위의 Printable을 구현한 
SPrinterDriver 와 LPrinterDriver 를 작성하시오.

interface Printable {
    public void print(String doc);
}
=================
From Samsung printer
This is a report about...

From LG printer
This is a report about...
=================================

class PrinterDriver {
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
*/