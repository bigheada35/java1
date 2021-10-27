package c17_p17_marker_instance_of_ex2;

public class Test1 {
	public static void main(String[] args) {

		Locable loc1 = new Fish();
    	Locable loc2 = new Tiger();
    	Locable loc3 = new Bird();
    	
    	checkLocation(loc1);
    	checkLocation(loc2);
    	checkLocation(loc3);
	}
	
	// 주의 : 꼭 static 붙이기
	public static void checkLocation(Locable loc) { 
		if (loc instanceof Sea) {
			System.out.println("바다에 삽니다.");			
		}else if(loc instanceof Ground) {
			System.out.println("육지에 삽니다.");
		}else {
			System.out.println("하늘에 살겠지");    	
		}
	}
}

interface Sea {
}

interface Ground {
}

interface Sky {
}

interface Locable {
	void printLive();
}
class Fish implements Locable, Sea {

	@Override
	public void printLive() {
		System.out.println("바다에 삽니다.");
	}
}

class Tiger implements Locable, Ground {

	@Override
	public void printLive() {
		System.out.println("육지에 삽니다.");
	}
}

class Bird implements Locable, Sky {

	@Override
	public void printLive() {
		System.out.println("하늘에 삽니다.");
	}
}


