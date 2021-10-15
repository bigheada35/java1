package EMornnigTest;

public class MoneyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Money money = new Money(-126000);
money.show();

출력 
잘못된 입력입니다.
오만원 0장....
오만원 0장....
등등등.... 
 * 
 */
		Money money = new Money(-126000);
		//Money money = new Money(126000);//test
		//Money money = new Money(126500);//test
		money.show();
		
	}

}
