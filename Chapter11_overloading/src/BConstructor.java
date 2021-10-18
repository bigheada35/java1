
public class BConstructor {

	public static void main(String[] args) {
		
		Person jung = new Person(335577, 112233);
		
		Person hong = new Person( 775544);
		
		jung.showPersonInfo();
		hong.showPersonInfo();

	}
}


class Person{
	
	private int regiNum;
	private int passNum;
	
	//void Person(int rnum, int pnum){
	Person(int rnum, int pnum){
		regiNum = rnum;
		passNum = pnum;
		
	}
	//void Person(int rnum){
	Person(int rnum){
//		regiNum = rnum;
//		passNum = 0;
		
		this(rnum, 0);
		
	}
	void showPersonInfo() {
		System.out.println("regiNum : " + regiNum);
		System.out.println("passNum : " + passNum);
		
	}
	
}