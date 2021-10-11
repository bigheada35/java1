
public class TTodayTest4 {

	public static void main(String[] args) {
		int count = get57(1,100);
		//count 는 1부터 100 까지의 숫자중 5의 배수 이자 7의 배수인 수의 갯수
		System.out.println(count );
	}

	public static int get57(int start, int end) {
		int cnt = 0;
		for(int i=1; i<=100; i++) {
			if( (i%5==0) && (i%7 == 0)) {
				cnt ++;
			}
			
		}
		return cnt;
	}





	
}
