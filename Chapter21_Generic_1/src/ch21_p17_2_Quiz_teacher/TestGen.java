package ch21_p17_2_Quiz_teacher;

public class TestGen {

	public static void main(String[] args) {

		
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);
        //System.out.println(box1);
        
        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        //System.out.println(box2);
        
        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);

        System.out.println(ddbox);
	}
}

class DBox<T1, T2> {
	private T1 ob1;
	private T2 ob2;
	
	public void set(T1 ob1, T2 ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	@Override
	public String toString() {
		return ob1 + " & " + ob2;
	}
}

class DDBox<T1, T2> {
	private T1 ob1;
	private T2 ob2;
	
	public void set(T1 ob1, T2 ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	@Override
	public String toString() {
		return ob1 + "\n" + ob2;
	}
}

