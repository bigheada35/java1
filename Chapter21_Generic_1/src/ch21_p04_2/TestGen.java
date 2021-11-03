package ch21_p04_2;

public class TestGen {

	public static void main(String[] args) {
		// 과일 담는 박스 생성
		Box aBox = new Box(); // 상자 생성
		Box oBox = new Box(); // 상자 생성
		
        // 과일을 박스에 담는다. 
        aBox.set(new Apple());
        oBox.set(new Orange());

        // 박스에서 과일을 꺼낸다.
//      Apple ap = aBox.get();
//      Orange og = oBox.get();
        
        //주의 : 형변환
        Apple ap = (Apple)aBox.get();
        Orange og = (Orange)oBox.get();

        System.out.println(ap);
        System.out.println(og);
	}
}

class Apple {
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

// 다음 상자는 사과도 오렌지도 담을 수 있다.
class Box { // 무엇이든 저장하고 꺼낼 수 있는 상자
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}
