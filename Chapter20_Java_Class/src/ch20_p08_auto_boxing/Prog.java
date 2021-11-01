package ch20_p08_auto_boxing;
public class Prog {
	public static void main(String[] args) {
			Integer iObj = 10;     // 오토 박싱 진행
	      Double dObj = 3.14;     // 오토 박싱 진행
	      
	      
	      System.out.println(iObj);
	      
	      System.out.println(dObj);
	      System.out.println(dObj.hashCode());
	      dObj = 3.10;
	      System.out.println(dObj);
	      System.out.println(dObj.hashCode());
	      
//인스턴스가 와야 할 위치에 기본 자료형 값이 오면 오토 박싱 진행
	      int num1 = iObj;     // 오토 언박싱 진행
	      double num2 = dObj;     // 오토 언박싱 진행
//기본 자료형 값이 와야 할 위치에 인스턴스가 오면 오토 언박싱 진행
	      System.out.println(num1);
	      System.out.println(num2);

	      	String str = new String();
	}
}
