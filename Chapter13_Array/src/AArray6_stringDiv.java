import java.util.Scanner;

public class AArray6_stringDiv {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.println("입력:");
			String str = sc.next();
			System.out.println(str);
	
			
			FileName fn = new FileName(str);
			fn.divFileNameExt();
			System.out.println();
		}
	}
}

class FileName{
	private String fullname;
	private String fname;
	private String fext;
	private boolean find;
	
	FileName(String fullname){
		this.fullname = fullname;
		find = false;
	}
	
	void divFileNameExt(){
		for(int i=0; i<fullname.length(); i++) {
			if(fullname.charAt(i) == '.') {
				fname = fullname.substring(0,i);
				fext = fullname.substring(i+1,fullname.length());
				find = true;
			}
		}
		if(find)
			System.out.println("파일이름은:" + fname + "이며 확장자는 " + fext + "입니다.");
		else
			System.out.println(".이 없습니다.");
	}
	
}



