
public class CString3 {

	public static void main(String[] args) {

		String st1 = "Coffee";
		String st2 = "Bread";

		String st3 =  st1.concat(st2);
		System.out.println(st3);
		
		String st4 =  "Fresh".concat(st3);//FreshCoffeeBread
		System.out.println(st4);
		
		System.out.println("------");
		System.out.println("Coffee : (2,4):" + st1.substring(2,4));
		System.out.println(st1.substring(2,5));
		System.out.println(st1);
		
	}


	
	
	
}	