
public class Rect {

	private int width;
	private int height;
	
	public void setWidth(int width) {
		if(width <0) {
			width = 0;
			System.out.println("err");
			return;
		}
		this.width = width;
	}
	public 	int getArea() {
		return width*height;
	}
		
	

}
