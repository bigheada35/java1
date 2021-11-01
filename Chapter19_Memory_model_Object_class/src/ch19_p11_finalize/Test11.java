package ch19_p11_finalize;
//
//finalize 메소드의 오버라이딩 예
//
public class Test11 {

	public static void main(String[] args) {
		   Person p1 = new Person("Yoon");
		   Person p2 = new Person("Park");
		   
		   //test1 막으면?
		   p1 = null;   // 참조대상을 가비지 컬렉션의 대상으로 만듦
		   p2 = null;   // 참조대상을 가비지 컬렉션의 대상으로 만듦
		   
		  // Object ob = new Person();
		   
		    //System.gc();
		   //System.runFinalization();

		   System.out.println("end of program");
	}

}



class Person {
	   String name;   
	   public Person(String name) {
	      this.name = name;
	   }
	   // 주의 : System.gc(); 이 실행되면, 아래를 탄다.
	   @Override
	   protected void finalize() throws Throwable {
		   // 주의 : 부모의 finalize 를 꼭 먼저 호출 해야 함.
	      super.finalize();   // 상위 클래스의 finalize 메소드 호출
	      System.out.println("destroyed: " + name);
	   }
	}
