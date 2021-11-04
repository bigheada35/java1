package today_test2_teacher;

class DBox<T1,T2>{
	private T1 ob1;
	private T2 ob2;
	public void set(T1 ob1, T2 ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	@Override
	public String toString() {
		// 주의 ob1.toString() 사용하기. --> 이게 더 낳다. String 타입도 맞고
		return (ob1.toString() + " & " + ob2.toString());
	}
}
class DDBox<T1,T2>{
	private T1 ob1;
	private T2 ob2;
	public void set(T1 ob1, T2 ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	@Override
	public String toString() {
		// 주의 ob1.toString() 사용하기. --> 이게 더 낳다. String 타입도 맞고
		return (ob1.toString() +"\n" + ob2.toString());
	}
}

public class Test2 {
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

/* 결과:
Apple & 25
Orange & 33
*/

/*
2. 아래의 결과가 나오도록 프로그래밍 하시오.

class DDBoxDemo {
    public static void main(String[] args) {
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);

        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        
        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);

        System.out.println(ddbox);
    }
}


==================
Apple & 25
Orange & 33
*/