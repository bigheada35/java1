package FMornigTest;

public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *public static void main(String[] args) {
                
                int math, science, english;
                math = 90;
                science = 80; 
                english = 80;

                Grade me = new Grade(math, science, english);
                System.out.println("평균은 " + me.average());
                System.out.println(me.getGrade()); //우 입니다.
 */
			int math, science, english;
			math = 90;
			science = 80;
			english = 80;
			Grade me = new Grade(math, science, english);
			System.out.println("평균은 " + me.average());
			System.out.println(me.getGrade());//우 입니다.
		
	}

}
