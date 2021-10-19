
public class AArray4_rotto {

	public static void main(String[] args) {
		
		//로또 번호 구하기
		//1. int 담는 6개 배열 선언
		//2. 각각의 배열에 랜덤으로 1 ~ 45
		//3. 중복 제거 해서 6개를 출력
		System.out.println("--");
		Rotto ro = new Rotto();
		
		//for(int i=0; i<30; i++) {//test
			ro.gen6();
			ro.print();
		//}

	}
}

class Rotto{
	
	private int[] arr = new int[6];

	public Rotto(){
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
			//System.out.println(arr[i]);
		}
	}
	
	private int gen() {
		double r = java.lang.Math.random();
		int rand = (int)(r * 45 + 1);
		return rand;
	}
	
	private boolean checkDuplicate(int num){
		boolean ret = false;
		for(int i=0; i<arr.length; i++) {
			//System.out.println("("+num +"," + arr[i] +")");
			if(num == arr[i]) {
				ret = true;
			}
		}
		return ret;
	}
	
	void gen6() {
		int num;
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
			
		for(int i=0; i<arr.length; i++) {
			
//  처음에 시도햇던 방법			
//			while(true) {
//				num = gen();
//				if(checkDuplicate(num)) {
//					System.out.println(i +"-duplicated-" + num);
//				}else {
//					break;
//				}
//			}
			
// 선생님 방법
			num = gen();
			if(checkDuplicate(num)) {
				System.out.println(i +"-duplicated-" + num);
				i--;
			}
			
			arr[i] = num;
		}
	}
	
	void print() {
		//System.out.println("--result--");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}


