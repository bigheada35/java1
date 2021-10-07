
public class Test1_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 21;
		if(n % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		
//		int n1 = 90;
//		int n2 = 100;
//		int n3 = 60;
		int n1,n2,n3;
		n1 = 90;	n2 = 100; n3 = 60;
		//n1 = 70;	n2 = 450; n3 = 6;
		//n1 = 450;	n2 = 70; n3 = 6;
		//n1 = 70;	n2 = 6; n3 = 450;
		
//		int cmp1, cmp2, cmp3;
//		int large, max;
//		
//		cmp1 = (n1 > n2)? n1 : n2;
//		cmp2 = (n1 > n3)? n1 : n3;
//		cmp3 = (n2 > n3)? n2 : n3;
//		
//		large = (cmp1 > cmp2) ? cmp1 : cmp2;
//		max = (cmp3 > large) ? cmp3 : large;
//		System.out.println("최대값은 " + max +"입니다");		
		
		int cmp, max;
		cmp = (n1 > n2)? n1 : n2;
		max = (n3 > cmp) ? n3 : cmp;
		
		System.out.println("최대값은 " + max +"입니다");
		
		
		int result = 3 + 6;
		System.out.println("3 + 6 = " + result);
		result += 9;
		System.out.println("3 + 6 + 9 = " + result);
		result += 12;
		System.out.println("3 + 6 + 9 + 12 = " + result);		
		
		
	}

}
