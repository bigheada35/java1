package edu.kosmo.ex.vow;
/*
저체중인지, 표준 인지, 과체중인지를 판단하는 프로그램을 작성하라. 
표준 체중 계산식은 다음을 사용하라.
표준체중(kg) = ( 키(cm) - 100 ) * 0.9

입력:
키(cm)를 입력하세요. : 193
체중(kg)을 입력하세요. : 25
출력:
표준 체중은 83.7입니다.
당신은 저체중 입니다. 
 */
public class BMICalculator {
	
	private double height;
	private double weight;
	
	
	public BMICalculator( double height, double weight) {
		this.height = height;
		this.weight = weight;		
	}

	public void printResult() {
		double mWeight = (height - 100) * 0.9;
		
		System.out.println("표준 체중은 " + mWeight + "입니다.");
		
		if(weight > mWeight) {
			System.out.println("당신은 과체중 입니다.");
		}else if(weight < mWeight) {
			System.out.println("당신은 저체중 입니다.");
		}else {
			System.out.println("당신은 표준 체중 입니다.");
		}
		
	}
	
}
