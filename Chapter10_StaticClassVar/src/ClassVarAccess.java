class AccessWay {
	
//	  1.공유변수, 클래스 변수, 정적변수, static 변수 
//	  2.static은 메모리에 먼저 올라간다. 
//	  3.static 변수는 메모리에 한번만 올라간다. 
//	  4.동일한 해당 객체들이 공유를 한다.
//	  
		//클래스 변수의 적절한 초기화 위치
	static int num = 0;
	//private static int num = 0;//test
	
	AccessWay(){
		incrCnt();
	}
	
	void incrCnt() {
		num++;
	}
}	

	//
	// 결과  : num = 3
	//
class ClassVarAccess{
	public static void main(String[] args) {
		
		AccessWay way = new AccessWay();
		
		way.num ++ ;//외부에서 인스턴스의 이름을 통한 접근
		
		AccessWay.num ++;//외부에서 클래스의 이름을 통한 접근
		
		System.out.println( "num = " + AccessWay.num);
	}
}

