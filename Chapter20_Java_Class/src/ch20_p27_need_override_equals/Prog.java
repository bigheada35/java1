package ch20_p27_need_override_equals;
import java.util.Arrays;//<-- ***
class INum {
	   private int num;
	   public INum(int num) {
	      this.num = num;
	   }
	}
//인스턴스 저장 배열의 비교 예  **********
//인스턴스 저장 배열의 비교 예  **********
//인스턴스 저장 배열의 비교 예  **********
public class Prog {
	public static void main(String[] args) {
		
	      INum[] ar1 = new INum[3];
	      INum[] ar2 = new INum[3];  //<-- **
	      
	      ar1[0] = new INum(1); ar2[0] = new INum(1);
	      ar1[1] = new INum(2); ar2[1] = new INum(2);
	      ar1[2] = new INum(3); ar2[2] = new INum(3);
	      
	      System.out.println("---  " + Arrays.equals(ar1, ar2));

		/*
		false
		결과가 의미하는 바는? 어떤 식으로 비교?
		
		
		Arrays의 equals 메소드가 내용을 비교하는 방식
		/////////////////////////////////////////
		public static boolean equals(Object[] a, Object[] a2)

		  	for (int i=0; i<length; i++) {
		     		Object o1 = a[i];
		     		Object o2 = a2[i];
     
	     			if (!(o1==null ? o2==null : o1.equals(o2)))
	         			return false;
	        } 		
	   ///////////////////////////////////////////
	   public boolean equals(Object obj) {
		   if(this == obj) // 두 인스턴스가 동일 인스턴스이면
		      return true;
		   else
		      return false;
		}    	// 이렇듯 Object 클래스에 정의된 equals 메소드는 참조 값 비교를 한다.
      		
	따라서 Arrays 클래스의 equals 메소드가 두 배열의 내용 비교를 하도록 하려면 
	비교 대상의 equals 메소드를 내용 비교의 형태로 오버라이딩 해야 한다.

  오버라이딩
  오버라이딩
  오버라이딩
  오버라이딩
		*/
	   
	}
}
