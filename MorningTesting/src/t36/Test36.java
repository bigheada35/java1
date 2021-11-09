package t36;

public class Test36 {
	public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();
        
        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
	}
    public static void wrapBox(Box box) {
        
        //instanceof 를 써서 해당 함수를 완성 하시오.
    	//형변환 되는지 여부를 확인하라 의미
    	//결과
    	/// 출력결과
    	/*Simple Wrapping
    	Paper Wrapping
    	Gold Wrapping
    	나와야 함.
    	*/
    	if( box instanceof GoldPaperBox) {
    		((GoldPaperBox) box).goldWrap();
    	}else if (box instanceof PaperBox) {
    		((PaperBox)box).paperWrap();
    	}else {
    		box.simpleWrap();
    	}
    }
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