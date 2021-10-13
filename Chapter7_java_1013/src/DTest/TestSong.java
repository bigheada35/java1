package DTest;

public class TestSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String title, String artist, String year, String country
		//출력:
		//1978년,스웨던 국적의 ABBA가 부른 "Dancing Queen" 
		Song song = new Song("Dancing Queen", "ABBA", "1978", "스웨덴");
		song.show();
	}

}
