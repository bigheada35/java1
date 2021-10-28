package e_today_test7_abstract_class;

import java.util.InputMismatchException;

/*

 */

public class Test5 {

	public static void main(String[] args) {
		try {
				int num = 6 / 0;
		} 
//		catch (Exception e) 
//		{
//				e.printStackTrace();
//		}
		
		catch (Error e) 
		{
				e.printStackTrace();
		}	
		catch (InputMismatchException e) {
				e.printStackTrace();
		}
		
	}
}

