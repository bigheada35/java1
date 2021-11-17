package c_today_test5_teacher;

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
			map.saveFileMap();
			
			System.out.println("========");
			
			map.readFileMap();
			map.printFileMap();

	}

}
class CountryMap{
	
	private HashMap<String, Integer> map;
	
	public CountryMap() {
	    map = new HashMap<>();
	}
	
	public HashMap<String, Integer> getMap() {

	    try {
	        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
	        Scanner sc = new Scanner(System.in);

	        int population = 0;
	        String country = " ";

	        while (true) {
	            System.out.print("나라 이름, 인구 >> ");
	            country = sc.next();

	            if (country.equals("그만")) // 입력 "그만" 하면 입력 종료
	                break;

	            population = sc.nextInt();
	            map.put(country, population);
	        }


	    } catch (Exception e) {
	        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
	        getMap();
	    }

	    return map;
	}
	
	
	public void setMap(HashMap<String, Integer> map) {
	    this.map = map;
	}

	public void search() {

	    try {
	        // 키 입력받아서 검색해서 정보 출력하기 그만할때까지
	        // 없으면 없습니다 출력
	        Scanner sc = new Scanner(System.in);

	        String key = " ";
	        while (true) {
	            System.out.print("인구 검색 >> ");
	            key = sc.next();

	            if (key.equals("그만")) // 입력 "그만" 하면 검색 종료
	                break;
	            else if (!map.containsKey(key)) { // map의 key에 key가 있지 않으면
	                System.out.println(key + " 나라는 없습니다.");
	                continue;
	            }
	            System.out.println(key + " " + map.get(key)); // 키값으로 내용 출력
	        }

	    } catch (Exception e) {
	        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
	        getMap();
	    }

	}

	
	
	// country.bin 에 HashMap<String, Integer> map; 안에 저장된 나라와 인구수를 저장
	// I/O Stream 사용
	private static final String FILE_NAME = "src\\c_today_test5_teacher\\country.bin";
	
	public boolean saveFileMap() {
	    
		boolean isDone = true;
		OutputStream os = null;
		// 주의 : 왜? 보조 스트림 DataOutputStreadm을 사용해야 하는가?? --> 데이터를 유용하게 사용하기 위해서..~!
		DataOutputStream dos = null;
		
			try {
				os = new FileOutputStream(FILE_NAME);
				dos = new DataOutputStream(os);
				
				Set<String> set = map.keySet();
				for (String key : set) {
					String country = key;
					int population = map.get(key);
					
					dos.writeUTF(country);
					dos.writeInt(population);
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					if(os!=null)
						os.close();
					if(dos!=null)
						dos.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			
			}
				
		return isDone;
	}
	// I/O Stream 사용 
	// 저장된 country.bin 을 읽어 들여, HashMap<String, Integer> 으로 반환  
	public HashMap<String, Integer> readFileMap() {
		HashMap<String, Integer> countryMap = null;
		
		countryMap = new HashMap<String, Integer>();
		InputStream is = null;
		DataInputStream dis = null;
		try {
			is = new FileInputStream(FILE_NAME);
			dis = new DataInputStream(is);
			
			while(dis.available() > 0) {
				String country = dis.readUTF();
				int pop = dis.readInt();

				countryMap.put(country, pop);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				if(is!=null)
					is.close();
				if(dis != null)
					dis.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		return countryMap;
	}
	// I/O Stream 사용 
	// 저장된 country.bin 을 읽어 들여, 저장된 나라와 인구수를 출력
	public void printFileMap() {
		
		DataInputStream dis = null;
		InputStream is = null;
		try {
			is = new FileInputStream(FILE_NAME);
			dis = new DataInputStream(is);
			while(dis.available()>0) {
				String country = dis.readUTF();
				int pop = dis.readInt();
				System.out.println("나라" + country + "인구"+ pop);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
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