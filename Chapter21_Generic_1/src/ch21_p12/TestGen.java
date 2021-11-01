package ch21_p12;

public class TestGen {
	//다중 매개변수 기반 제네릭 클래스의 정의
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);
	}
}
//다중 매개변수 기반 제네릭 클래스의 정의
class DBox<L, R> {
	private L left; // 왼쪽 수납 공간
	private R right; // 오른쪽 수납 공간

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + " & " + right;
	}
}
/*
 결과:
Apple & 25
*/
