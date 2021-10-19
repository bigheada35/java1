import java.util.Scanner;
import edu.kosmo.ex.vow.ConsVowCount;

public class RConsVow_OopStyleAnswer {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("영어 입력 하세요");
			Scanner sc = new Scanner(System.in);
			String word = sc.next();
			
			ConsVowCount cvc = new ConsVowCount(word);
			cvc.countResult();
			
			
			//Y or N
			System.out.println("종료 ? ( Y/N )");
			String YesOrNo = sc.next();
			if(YesOrNo.equals("Y") ||
				YesOrNo.equals("y")	||
				YesOrNo.equals("Yes") ||
				YesOrNo.equals("yes")
			) {
				continue;
			}else {
					System.out.println("종료");
					break;
			}
		}
	}
	
	
}	