package d_today_test8;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Test8 {
	public static void main(String[] args) {
		Average avg = new Average();
		avg.input();
		System.out.println("평균: " + avg.print());
	}
}

class Average{
	private final int CNT = 6;
	List<String> list = new ArrayList<>();
	List<Double> dlist = new ArrayList<>();
	void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();

		while(true) {
			
			System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
			String in = sc.nextLine();
			StringTokenizer token = new StringTokenizer(in, " ");
			if(token.countTokens() != CNT) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			//주의 : nextToken을 쓰면 token이 빠져나오고, countTokens() 가 줄어든다.
			int tokcnt = token.countTokens();
			
			for(int i=0; i< tokcnt; i++) {
				
				String str = token.nextToken();
				
				if(str.charAt(0) < 'A' ||  'F'< str.charAt(0) || (str.length() != 1) ) {
					
					
					System.out.println("잘못된입력입니다.");
					list.clear();
					continue;
				}
				
				list.add(str);
			}
		
			break;
		}

	}
	double print() {
		double score=0;
		double sum = 0;
		for (String str : list) {
			switch(str.charAt(0)) {
			case 'A':
				score = 4.0;
				break;
			case 'B':
				score = 3.0;
				break;
			case 'C':
				score = 2.0;
				break;
			case 'D':
				score = 1.0;
			}
			sum += score;
		}
		return (sum/(double)list.size());
	}
}

/*

8.Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 ArrayList에 저장하고,
ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 평균을 출력하는 프로그램을 작성하라.
*/
