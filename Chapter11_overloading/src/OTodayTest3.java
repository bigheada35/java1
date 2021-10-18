import java.util.Scanner;

//import java.util.Scanner;

public class OTodayTest3 {

	public static void main(String[] args) {
		
		int tall;
		int weight;
		double standard_weight;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm)를 입력하세요. : ");
		tall = sc.nextInt();
		System.out.println(tall);
		System.out.print("체중(kg)을 입력하세요. : ");
		weight = sc.nextInt();
		System.out.println(weight);
		
		System.out.println("출력:");
		standard_weight = (tall - 100) * 0.9;
		System.out.println("표준 체중은 " +  standard_weight + "입니다.");
		if(weight >= standard_weight + 10)
			System.out.println("당신은 고체중 입니다. ");
		else if(weight >= (standard_weight - 10))
			System.out.println("당신은 표준 체중 입니다. ");
		else
			System.out.println("당신은 저체중 입니다. ");
			
	}


	
	
	
}	