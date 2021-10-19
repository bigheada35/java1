
public class Tprintf {

	public static void main(String[] args) {
		int age = 20;
		double height = 178.2;
		String name = "YOON SUNG WOO";
		System.out.printf(" name : %s \n", name);
		System.out.printf(" age : %d \n height : %e \n \n", age, height);
		/**
		 
		 	%e :  e 표기법 기반의  실수 출력
		 	
		 	%o  :  8진수 표시
		 	
		 	%g  : 출력의 대상에 따라서  %e 또는 %f 형태로 출력
		 	
		 	
		 */
		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
		System.out.printf(" %g \n", 0.00014);
		System.out.printf(" %g \n", 0.000014);
	}

	
	/*
	 * 
	 결과 : 
	  name : YOON SUNG WOO 
 	age : 20 
 	height : 1.782000e+02 
 
 	77 - 115 - 4d 

 	0.000140000 
 	1.40000e-05 

	 */
	
}

