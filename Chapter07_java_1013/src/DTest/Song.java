package DTest;

public class Song {
	String title;
	String artist;
	String year;
	String country;
	
	public Song(){
		
	}
	
	public Song(String title, String artist, String year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show(){
		
//		System.out.println("title:" + title);
//		System.out.println("artist:" + artist);
//		System.out.println("year:" + year);
//		System.out.println("country:" + country);
		System.out.println(year+"년," + country + "국적의 " + artist +"가 부른" + "\"" + title +"\"");
		
	}
	
}
