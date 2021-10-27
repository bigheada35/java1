package c18_p17_class_cast_exception;

public class Test22 {
	//class Board { }//	A 에러 초래:
	//class PBoard extends Board { }//	A 에러 초래:
	public static void main(String[] args) {
		//A 에러 : No enclosing instance of type Test22 is accessible. 
		//Must qualify the allocation with an enclosing instance of type Test22 
		//(e.g. x.new A() where x is an instance of Test22).
	      Board pbd1 = new PBoard();
	      PBoard pbd2 = (PBoard)pbd1;   // OK!

	      System.out.println(".. intermediate location .. ");
	      Board ebd1 = new Board();
	      PBoard ebd2 = (PBoard)ebd1;   // Exception!
	}
}

class Board { }
class PBoard extends Board { }

/*
 실행결과:
	.. intermediate location .. 
	Exception in thread "main" java.lang.ClassCastException: class c18_p17_class_cast_exception.Board cannot be cast to class c18_p17_class_cast_exception.PBoard (c18_p17_class_cast_exception.Board and c18_p17_class_cast_exception.PBoard are in unnamed module of loader 'app')
		at c18_p17_class_cast_exception.Test22.main(Test22.java:16)

 */


