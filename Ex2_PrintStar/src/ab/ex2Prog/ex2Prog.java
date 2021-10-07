package ab.ex2Prog;

public class ex2Prog {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int i=2;
//		System.out.println("----");
//		for(i=20;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.printf("%c", '☆');
//				//System.out.printf("%c", 'ⓙ');
//			}
//			System.out.println("");
//		}
		
//		int a = 3;
//		System.out.printf("%d", a%2);
		
		int x=4, y=3;
		
		for(int j=0;j<10;j++) {
			for(int i=0;i<10;i++) {
				//테두리enter
				if(i==0 && j==0) {
					System.out.printf("%C", '┌');
					for(int top=0;top<10;top++)
						System.out.printf("%C", '┯');
					System.out.printf("%C", '┐');
					System.out.println();
				}
				if(i==0) {
					System.out.printf("%C", '├');
					//System.out.printf("%C", '│');
					//System.out.printf("%C", '○');
				}
				//테두리leave
				
				if(i==x && j==y)
					System.out.printf("%C", '●');
				else
					System.out.printf("%C", '┼');
				
				//테두리enter
				if(i==9) {
					System.out.printf("%C", '┤');	
					//System.out.printf("%C", '│');
					//System.out.printf("%C", '○');
				}
				if(i==9 && j==9) {
					System.out.println();
					System.out.printf("%C", '└');
					for(int bot=0;bot<10;bot++)
						System.out.printf("%C", '┴');
					System.out.printf("%C", '┘');
				}
				//테두리leave
				
			}
			System.out.println();
		}
	}

}
