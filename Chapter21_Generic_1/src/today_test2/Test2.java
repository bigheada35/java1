package today_test2;
public class Test2 {
	//public static void main(String[] args) {
	public static void main() {
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
class DBox<L,R>{
	private L name;
	private R ea;
	void set(L name, R ea){
		this.name = name;
		this.ea = ea;
	}
	@Override
	public String toString() {
		//주의 : 제너릭에서는 this.name +  this.pea 리턴은 않됨 에러남.
		//  에러내용 : The operator + is undefined for the argument type(s) L, R
		//return (this.name +  this.pea);
		return( name + " & " + ea);
	}
}

class DDBox<L,R> {
	private L l;
	private R r;
	void set(L l, R r) {
		this.l = l;
		this.r = r;
	}
	@Override
	public String toString() {
		// 주의 : 제너릭 사용시에는  return (l + r); 처럼 l + r을 사용하면 에러남.
		//return (l + r);
		return (l + "\n" + r);
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