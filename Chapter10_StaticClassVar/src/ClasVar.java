class InstCnt {
	
	/* 
	  1.공유변수, 클래스 변수, 정적변수, static 변수 
	  2.static은 메모리에 먼저 올라간다. 
	  3.static 변수는 메모리에 한번만 올라간다. 
	  4.동일한 해당 객체들이 공유를 한다.
	 */
	static int instNum = 1;
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스생성: "+ instNum);
	}
}	
	
class ClasVar{
	public static void main(String[] args) {
		
		System.out.println("인스턴스생성 전: InstCnt.instNum "+ InstCnt.instNum);
		
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
	}
}

