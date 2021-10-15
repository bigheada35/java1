package CTest;

class TV {
	String brand;
	int mfyear;
	int size;
	
	TV(String brand, int mfyear, int size){
		this.brand = brand;
		this.mfyear = mfyear;
		this.size = size;
	}
	
	void show() {
		System.out.println(brand + "에서 만든" + mfyear + "년형 " + size +"인치 TV");
	}
}
