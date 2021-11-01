package ch20_p11;
//Number 클래스의 추상 메소드 호출의 예
public class Prog {
	public static void main(String[] args) {
			Integer num1 = new Integer(29);
		   System.out.println(num1.intValue());    // int형 값으로 반환
		   System.out.println(num1.doubleValue());    // double형 값으로 반환

		   Double num2 = new Double(3.14);
		   System.out.println(num2.intValue());    // int형 값으로 반환
		   System.out.println(num2.doubleValue());    // double형 값으로 반환
/*
결과:
	29
	29.0
	3
	3.14
 */
	}
}
