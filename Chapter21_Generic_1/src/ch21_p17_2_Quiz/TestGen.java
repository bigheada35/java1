package ch21_p17_2_Quiz;

public class TestGen {

	public static void main(String[] args) {

		
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);
        System.out.println(box1);
        
        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        System.out.println(box2);
        
        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);

        System.out.println(ddbox);
	}
}

class DBox<T,E>{
	private T fruit;
	private E pea;
	
	void set(T fruit,E pea){
		this.fruit = fruit;
		this.pea = pea;
	}
	@Override
	public String toString() {
		
		// 주의 : 에러 발생 --> "," 넣어줘야함? <-- ??
		//return fruit + pea;
		
		return fruit +", "+ pea;
		//return ((String)(fruit + pea));
	}
	
}
class DDBox<L,R>{
	private L left;
	private R right;
	public void set(L left,R right){
		
		// 주의 : this.안붙여도 에러 안남 . <-??
		//left = left;
		//right = right;		
		
		this.left = left;
		this.right = right;
	}
	@Override
	public String toString() {
		return left +"\n" + right;
	}
}


