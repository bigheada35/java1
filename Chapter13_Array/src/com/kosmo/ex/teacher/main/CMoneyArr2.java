package com.kosmo.ex.teacher.main;

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

public class CMoneyArr2 {

	public static void main(String[] args) {
		//int money = 4500;
		int money = 4530;
		MoneyArr2 moneyArr = new MoneyArr2(money);
		moneyArr.show();
	}
}

class MoneyArr2{
	private int money;
	private int[] coin = {500, 100, 50, 10};
	
	public MoneyArr2(int money) {
		this.money = money;
	}
	
	public void show() {
		for(int i=0; i<coin.length; i++) {
			System.out.println(coin[i] + "원" + money/coin[i] + "개");
			money = money % coin[i];
		}
	}
}



