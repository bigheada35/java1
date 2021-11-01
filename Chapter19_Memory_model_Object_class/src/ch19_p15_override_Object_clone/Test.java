package ch19_p15_override_Object_clone;

class Point implements Cloneable {
	   private int xPos;
	   private int yPos;

	   public Point(int x, int y) {
	      xPos = x;
	      yPos = y;
	      System.out.println("생성자");
	   }

	   public void showPosition() {
	      System.out.printf("[%d, %d]", xPos, yPos);
	      System.out.println();
	   }

	   @Override
	   public Object clone() throws CloneNotSupportedException {
		 //접근 수준 지시자를 protected에서 public으로 바꾸기 위한 메소드 오버라이딩
		   
		   
	      return super.clone();   // Object 클래스의 clone 메소드 호출
	   }
	}

public class Test {
		public static void main(String[] args) {
		      Point org = new Point(3, 5);
		      Point cpy;

		      try {
		         cpy = (Point)org.clone();
		         org.showPosition();
		         cpy.showPosition();
		         
		         //test
		         if(org == cpy) {
		        	 System.out.println("같다");
		         }
		      }
		      catch(CloneNotSupportedException e) {
		         e.printStackTrace();
		      }
    
		}
}


/*
 * 
 * 
 * clone 메소드 호출의 예
 * 
 * 


 결과: 

[3, 5]
[3, 5]


 */