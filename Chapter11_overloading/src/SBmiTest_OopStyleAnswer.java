import java.util.Scanner;

import edu.kosmo.ex.vow.BMICalculator;
import edu.kosmo.ex.vow.ConsVowCount;

public class SBmiTest_OopStyleAnswer {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("키(cm)를 입력하세요");
			int height = sc.nextInt();
			System.out.println("체중(kg)을 입력하세요");		
			int weight = sc.nextInt();
			
			BMICalculator bmi = new BMICalculator(height, weight);
			bmi.printResult();
			
			if(checkExit()) {
				break;
			}
		}
	} 
	
	private static boolean checkExit() {
		System.out.println("나가시겠습니까? (Y/N)");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.equals("N") || str.equals("n"))
			return false;
		else			
			return true;
				
	}
	
	
}	