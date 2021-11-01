package ch19_p16_clone_shallow_copy;
class Point implements Cloneable {
	   private int xPos;
	   private int yPos;

	   public Point(int x, int y) {
	      xPos = x;
	      yPos = y;
	   }

	   public void showPosition() {
	      System.out.printf("[%d, %d]", xPos, yPos);
	      System.out.println();
	   }

	   @Override
	   public Object clone() throws CloneNotSupportedException {
	      return super.clone();   // Object 클래스의 clone 메소드 호출
	   }
	}

class Rectangle implements Cloneable {
	   private Point upperLeft;   // 좌측 상단 좌표
	   private Point lowerRight;   // 우측 하단 좌표

	   public Rectangle(int x1, int y1, int x2, int y2) {
	      upperLeft = new Point(x1, y1);
	      lowerRight = new Point(x2, y2);
	   }
	   //. . . .
	   @Override
	   public Object clone() throws CloneNotSupportedException {
	      return super.clone();
	   }
	   //. . . .
	}

public class Test {
		public static void main(String[] args) {
			   Rectangle org = new Rectangle(1, 1, 9, 9);
			   Rectangle cpy;
			   
			   try {
			      cpy = (Rectangle)org.clone(); 
			      //. . . . 
			   }
			   catch(CloneNotSupportedException e) {
			      e.printStackTrace();
			   }

		}
}
/*


Shallow Copy



 */