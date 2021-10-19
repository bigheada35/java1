
/*

 ### 10.아래를 배열을 활용하여 프로그램을 짜시오.
화폐매수 구하기
- 1원 부터 5000 원 까지 랜덤으로 생성.
- 500원 100 원 50 원 10원은 배열로 선언 하여 저장 

해당 랜덤생성된 화폐 매수를 아래와 같이 출력

2860원 

출력
500원 : 5개 
100원 : 3개 
50원 : 1개 
10원 : 1개

 */

public class AArray7_Money {

	public static void main(String[] args) {
		AutoMoney am = new AutoMoney();
		am.show();
	}
}

class AutoMoney{
	
	private int money;
	private int[] rem = new int[4+1];
	private int[] divMon = new int[4];
	
	AutoMoney(){
		this.divMon[0] = 500;
		this.divMon[1] = 100;
		this.divMon[2] = 50;
		this.divMon[3] = 10;
		this.money = gen();
		System.out.println(this.money);
	}
	private int gen() {
		double r = java.lang.Math.random();
		int rand = (int)(r * 5000 + 1);
		return rand;
	}
	void show() {
		rem[0] = money;
		
		for(int i=0; i<4; i++) {
			System.out.println( divMon[i]+ "원" + rem[i]/divMon[i] +"개");
			rem[i+1] = rem[i] % divMon[i];
		}
		
	}
	
}




