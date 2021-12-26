package t13;


public class Test13 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i=1; i<10000; i++) {
			if( (i%5 == 0) &&  (i%7 == 0) ) {
				cnt ++;
			}
		}
		System.out.println("cnt: " +  cnt );
		
		
	}
}

