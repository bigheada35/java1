package g_today_test4;
import java.util.StringTokenizer;
public class Prog {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("PM:08:45", ":");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+  " ");
		}
	}
}

/*
결과: 
	PM 08 45 
 */

/*
4.아래의 문자열을 ":" 구분자로 하여, PM 08 45 를 차례로 출력하는 프로그램을 작성 하시오.
"PM:08:45"
 */

