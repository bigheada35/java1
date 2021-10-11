
public class TTodayTest7 {

	public static void main(String[] args) {
		int month = 4;
		getSeason(3);// 봄입니다. 출력
		getSeason(12);// 겨울 입니다. 출력
	}

	private static void getSeason(int i) {
		
		switch(i) {
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("봄입니다.");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("여름입니다.");
			break;
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		default:
			break;
		}
		
	}
	







	
}
