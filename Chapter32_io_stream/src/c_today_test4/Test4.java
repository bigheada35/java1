package c_today_test4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryMap map = new CountryMap();
		map.getMap();
		map.search();
	}

}
class CountryMap{
	
	private HashMap<String,Integer> map;
	
	public CountryMap() {
		map = new HashMap<>();
	}
	
	public HashMap<String, Integer> getMap() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		
		while(true) {
			
			System.out.print("나라 이름, 인구 >>");
			String country = sc.next();
			
			if(country.equals("그만")) {
				break;
			}
			
			Integer popula = sc.nextInt();
			map.put(country, popula);
		}
		return map;
	}
	
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	
	public void search() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("인구 검색 >>");
			String countryInput = sc.next();
			
			if(countryInput.equals("그만"))
				break;
			
			Set<String> set = map.keySet();
			Iterator<String> ite = set.iterator();
			
			
			while(ite.hasNext()) {
				String s = ite.next();
				if(s.equals(countryInput)) {
					
					Integer i = map.get(s);
					System.out.println(s + "의 인구는" + i + "입니다.");
				}
			}
			
			if(!set.contains(countryInput)) {
				System.out.println(countryInput + " 나라는 없습니다.");
			}
			
		}
	}
	
}

/*
 4.금일 배운 내용을 바탕으로,  아래를 프로그래밍 하시오.

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
  
그만"이 입력될 때까지 나라 이름과 인구를 입력 받아 저장하고, 
다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 해시맵을 이용하여 아래와 같이 작성 하였다.
 
*/