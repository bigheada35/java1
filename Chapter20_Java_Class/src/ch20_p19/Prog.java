package ch20_p19;

import java.util.Random; //<-- **
//난수 생성의 예
public class Prog {
	public static void main(String[] args) {
		//실행할 때마다 다른 결과를 보인다  <-- ** <-- **
		Random rand = new Random(); 
									//public Random() {
		   							// 	Random(long seed) 생성자 호출 
		   							//	this(System.currentTimeMillis()); 
									//}
		   for(int i = 0; i < 7; i++)
		      System.out.println(rand.nextInt(1000));
		   
		   System.out.println("======");
		   //실행할 때마다 같은 결과를 보인다  <-- ** <-- ** <-- **
		   Random rand2 = new Random(12);   
		   for(int i = 0; i < 7; i++)
		      System.out.println(rand2.nextInt(1000));
/*
	781
	272
	709
	88
	965
	37
	224
	======
	866
	812
	556
	133
	624
	211
	750

 */
	   
	}
}
