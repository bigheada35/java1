package r_today_test2_teacher;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Test2 {

	public static void main(String[] args) {
		
		CountryMap countryMap = new CountryMap();
		countryMap.getMap();
		countryMap.search();

	
	}

}

class CountryMap{
	private HashMap<String, Integer> map;
	
	public CountryMap() {
		map = new HashMap<>();
	}
	
	public HashMap<String, Integer> getMap() {
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		
		int population = 0;
		String country = "";
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 ( 예: Korea 5000) >>");
			while(true) {
				
				country = sc.next();
		
				if(country.equals("그만"))
					break;
				
				population = sc.nextInt();
				map.put(country, population);
			}
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요");
			getMap();
		}	
		
		
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		

		
		this.map = map;
	}
	
	public void search() {
		try {
			Scanner sc = new Scanner(System.in);
			String key= "";
			
			while(true) {
				System.out.println("인구검색 >>");
				key = sc.next();
			
				if(key.equals("그만"))
					break;
				//
				// 주의 : containsKey () 사용하기!!!
				//
				else if(!map.containsKey(key)) {
					System.out.println(key + "나라는 없습니다.");
				}
				System.out.println(key + " " + map.get(key));/// 내용 출력
			}

			
		} catch (Exception e) {
			System.out.println("잘못입력 다시 ");
			search();
		}
		
	}
	
}



/*

"그만"이 입력될 때까지 나라 이름과 인구를 입력 받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라. 
다음 해시맵을 이용하라.
=================================================================================
나라 이름과 인구를 입력하세요.(예: Korea 5000)
나라 이름, 인구 >> Korea 5000
나라 이름, 인구 >> USA 1000000
나라 이름, 인구 >> Swiss 2000
나라 이름, 인구 >> France 3000
나라 이름, 인구 >> 그만

인구 검색 >> France
France의 인구는 3000
인구 검색 >> 스위스
스위스 나라는 없습니다.
인구 검색 >> 그만

*/