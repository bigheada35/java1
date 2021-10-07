
public class FindNum_Multi4And7First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		boolean searched = false;
		
		while(num < 100) {
			
			if( (num % 5 == 0) && (num % 7 == 0)) {
				searched = true;
				break;
			}
			
			num ++;
		}
		
		
		if(searched) {
			System.out.println("5의 배수이면서, 7의 배수인  첫번째 값을 찾았습니다 .값은 : " +  num);	
		}else {
			System.out.println("5의 배수이면서, 7의 배수인  값이 하나도 없습니다. ");
		}
		
	}

}
