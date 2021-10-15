class Rectangle{

	private int width;
	private int height;	

	Rectangle(int width, int height){
		if(width <=0 || height <=0) {
			System.out.println("err");
			return;
		}
		this.width = width;
		this.height = height;
	}
	
	int getWidth() {
		return width;
	}
	void setWidth(int width) {
		this.width = width;
	}
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		this.height = height;
	}
	
	int getArea() {
		return width*height;
	}
	
}
