package ch20_p20_token;
import java.util.StringTokenizer;  //<-- ***
//문자열의 토큰 구분
public class Prog {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("PM:08:45", ":");
//	       public boolean hasMoreTokens(); 	//반환할 토큰이 남아 있는가?
				System.out.println(st.hasMoreTokens());
//	       public String nextToken() ;		//다음 토큰을 반환
				
				System.out.println("--- " + st.countTokens());
				
				while(st.hasMoreTokens()) {
					System.out.println("nex:" + st.nextToken());
				}
				
				System.out.println("--- " + st.countTokens());		

/*
  "PM:08:45"
   이 문자열의 구분자가 :일 경우 토큰은 다음 세 가지
   PM    08    45



true
--- 3
nex:PM
nex:08
nex:45
--- 0

 */
	   
	}
}
