
public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int mon = 8;
		// int mon = 22;
		int mon = 14;

		switch (mon) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("봄입니다");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다.");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
		//case 13, 14:
			System.out.println("겨울 입니다");
			break;

		default:
			System.out.println("잘못된 입력 입니다.");
			break;
		}

	}

}
