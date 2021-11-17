package c_today_test5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test5 {

	public static void main(String[] args) {

		CountryMap map = new CountryMap();
		
		map.getMap();
		map.saveFileMap();//sj - add
		
		System.out.println();
		
		map.readFileMap();//sj - add
		map.search();
	}

}
class CountryMap{
	
	private HashMap<String,Integer> map;
	private final String FILE_NAME = "src\\c_today_test5\\contry.bin";
	
	public CountryMap() {
		map = new HashMap<>();
	}
	
	public HashMap<String, Integer> getMap() {
		try {
			
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
			
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
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
			String countryInput = null;
			
			while(true) {
				
				System.out.print("인구 검색 >>");
				countryInput = sc.next();
				
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
			
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			search();
		}
		

	}
	
	//sj - add
	public boolean saveFileMap() {
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			
			os = new FileOutputStream(FILE_NAME);
			dos = new DataOutputStream(os);

			Set<String> set = map.keySet();
			Iterator<String> it = set.iterator();
			
			while(it.hasNext()) {
				
				String country = it.next();
				Integer population = map.get(country);
				
				//String save = country + " " + String.valueOf(population) + "\n";
				//dos.writeBytes(save);
				
				dos.writeUTF(country);
				dos.writeInt(population);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(os != null)
					os.close();
				if(dos != null)
					dos.close();
			} catch (Exception e2) {
				
			}
		}
		return false;
	}
	//sj - add
	public HashMap<String, Integer> readFileMap(){
		
		InputStream is = null;
		DataInputStream dis = null;
				
		try {
			
			is = new FileInputStream(FILE_NAME);
			dis = new DataInputStream(is);

			while(dis.available() > 0) {
				
				//String country = dis.readLine();
				//System.out.println(country + ", ");
				
				String country = dis.readUTF();
				Integer population = dis.readInt();
				//System.out.println(country + "," + population);
				
				map.put(country, population);
				
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(is != null)
					is.close();
				if(dis != null)
					dis.close();
				
			} catch (Exception e2) {
				
			}
		}
		return map;
		
	}
	
	//sj - add
	public void printFileMap() {
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			
			String country = it.next();
			Integer population = map.get(country);
			System.out.println(country + "\t" + population);
		}
	}
	
	
}

/*
 위의 CountryMap 에서 아래의 함수를 추가하여 테스트 하시오

// country.bin 에 HashMap<String, Integer> map; 안에 저장된 나라와 인구수를 저장
// I/O Stream 사용 
public boolean saveFileMap() {
    
}
// I/O Stream 사용 
// 저장된 country.bin 을 읽어 들여, HashMap<String, Integer> 으로 반환  
public HashMap<String, Integer> readFileMap() {
    
}
// I/O Stream 사용 
// 저장된 country.bin 을 읽어 들여, 저장된 나라와 인구수를 출력
public void printFileMap() {
		    
}

 
*/