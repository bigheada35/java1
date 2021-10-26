package c15.v5.ex_instanceof;

public class Ex_instancof {
	
	
    public static void wrapBox(Box box) {
    	
	//instanceof 를 써서 해당 함수를 완성 하시오.
//		if(box instanceof Box){
//			System.out.println("Simple Wrapping");
//		}else if(box instanceof PaperBox){
//			System.out.println("Paper Wrapping");
//		}else{
//			System.out.println("Gold Wrapping");
//		}
	
		if(box instanceof GoldPaperBox){
			System.out.println("Gold Wrapping");
		}else if(box instanceof PaperBox){
			System.out.println("Paper Wrapping");
		}else{
			System.out.println("Simple Wrapping");
		}
        
    }
    
	
	public static void main(String[] args) {
		
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();
        
        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
	}
		
	/*
	/// 출력결과
	Simple Wrapping
	Paper Wrapping
	Gold Wrapping
	*/

}

class Box {
    public void simpleWrap() { 
        System.out.println("Simple Wrapping");
    }
}

class PaperBox extends Box {
    public void paperWrap() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox {
    public void goldWrap() {
        System.out.println("Gold Wrapping");
    }
}
