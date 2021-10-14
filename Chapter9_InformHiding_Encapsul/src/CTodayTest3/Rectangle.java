package CTodayTest3;

class Rectangle {
	//주의 private로 항상 하기
	private int x, y, w, h;
	
	Rectangle(int x, int y, int w, int h){
		setX(x);
		setY(y);
		setW(w);
		setH(h);
	}
	
	void setX(int x) {
		if(x<=0)
			return;
		this.x = x;
	}
	void setY(int y) {
		if(y<=0)
			return;
		this.y = y;
	}
	void setW(int w) {
		if(w<=0)
			return;
		this.w = w;
	}
	void setH(int h) {
		if(h<=0)
			return;
		this.h = h;
	}
	
	int square() {
		return w*h;
	}
	
	void show() {
		System.out.println("("+ x +","+ y +")에서 크기가" + w + "x" + h +"인 사각형");
	}
	
	private boolean isContainCoordi(int coordx, int coordy) {
		if(( x < coordx) && (coordx < x+w)){
			if( (y < coordy) && (coordy < y+h)) {
				return true;
			}
		}
		return false;
	}
	
	boolean contains(Rectangle r) {
		int cnt = 0;
		
		if(isContainCoordi(r.x, r.y))
			cnt++;
		if(isContainCoordi(r.x, r.y+r.w))
			cnt++;
		if(isContainCoordi(r.x+r.h, r.y))
			cnt++;
		if(isContainCoordi(r.x+r.h, r.y+r.w))
			cnt++;			
	
		if(cnt == 4)
			return true;
		else
			return false;
	}

	
}
