
//public class RockPaperScissors {
class RockPaperScissors {
	
	private String randon = "";	

	String getRPS() {
		String str = "가위";
		//double r = Math.random();
		double r = java.lang.Math.random();
		int rand = (int)(r * 3 + 1);
		switch(rand) {
		case 1:
			str = "가위";
			break;
		case 2:
			str = "바위";	
			break;
		case 3:
			str = "보";
			break;
		default:
			System.out.println("err");
			break;
		}
		
		randon = str;
		return str;
	}
	
	private void genRPS() {
		String str = "가위";
		//double r = Math.random();
		double r = java.lang.Math.random();
		int rand = (int)(r * 3 + 1);
		switch(rand) {
		case 1:
			str = "가위";
			break;
		case 2:
			str = "바위";	
			break;
		case 3:
			str = "보";
			break;
		default:
			System.out.println("err");
			break;
		}
		
		randon = str;
	}
	
	String compareRPS(String in) {
			
		
			String str = "비겼습니다.";
			boolean win = false;
		
			if(in.equals(randon)) {
				str = "비겼습니다";
				
			}else {
				if(in.equals("가위")) {
					if(randon.equals("바위"))
						win = false;
					else if(randon.equals("보"))
						win = true;
				}else if(in.equals("바위")) {
					if(randon.equals("보"))
						win = false;
					else if(randon.equals("가위"))
						win = true;
				}else if(in.equals("보")) {
					if(randon.equals("가위"))
						win = false;
					else if(randon.equals("바위"))
						win = true;
				}
				
				if(win)
					str = "이겼습니다.";
				else
					str = "졌습니다.";
			}
			
			return str;
	}
}
