package ch20_p17;
//수학 관련 연산 기능을 제공하는 Math 클래스
public class Prog {
	public static void main(String[] args) {
		System.out.println("원주율: " + Math.PI);
		   System.out.println("2의 제곱근: " + Math.sqrt(2));
		   System.out.println();
		   System.out.println("파이에 대한 Degree: " + Math.toDegrees(Math.PI));
		   System.out.println("2 파이에 대한 Degree: " + Math.toDegrees(2.0 * Math.PI));
		   System.out.println();
		   
		   double radian45 = Math.toRadians(45); // 라디안으로의 변환!
		   System.out.println("싸인 45: " + Math.sin(radian45));
		   System.out.println("코싸인 45: " + Math.cos(radian45));
		   System.out.println("탄젠트 45: " + Math.tan(radian45));
		   System.out.println();
		   System.out.println("로그 25: " + Math.log(25));
		   //System.out.println("2의 16승: "+ Math.pow(2, 16));
		   System.out.println("2의 2승: "+ Math.pow(2, 2));
/*
	원주율: 3.141592653589793
	2의 제곱근: 1.4142135623730951
	
	파이에 대한 Degree: 180.0
	2 파이에 대한 Degree: 360.0
	
	싸인 45: 0.7071067811865475
	코싸인 45: 0.7071067811865476
	탄젠트 45: 0.9999999999999999
	
	로그 25: 3.2188758248682006
	2의 16승: 65536.0
 */
	   
	}
}
