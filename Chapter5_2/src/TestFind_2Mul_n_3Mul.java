
public class TestFind_2Mul_n_3Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int i=0;
		for(i = 1 ; i<1000; i++) {
			
			//if( (i % 2 == 0) && (i % 3 == 0)) {
			if( (i%2 == 0) && (i%3 == 0)) {
				break;
			}
		}
		System.out.println( "첫번째 (2 배수이자  3 배수 ) :"+ i);
		
		for(i = 1 ; i<1000; i++) {
			
			if( (i % 2 == 0) && (i % 3 == 0)) {
				System.out.print(i+",");
				count ++;
			}
		
		}
		System.out.println( "\n (2의배수이자3의배수) 모두 갯수:"+ count);
		
		count = 0;
		for(i = 1 ; i<1000; i++) {
			if( (i%2 != 0)  || (i%3 != 0) ) {
				continue;
			}
			count ++;
		}
		System.out.println( "\n (2의배수이자3의배수) 모두 갯수:"+ count);
		
	}

}
