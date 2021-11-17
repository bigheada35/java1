class Circle4 {
    double rad = 0;
    final double PI = 3.14;
    
    public Circle4(double r) {
        setRad(r);
    }

    public void setRad(double r) {
        if(r < 0) {
            rad = 0;
            return; 
        }
        
        rad = r;
    }
        
 // 원의 넓이 반환
    public double getArea() {
        return (rad * rad) * PI;
    }
}

class UnsafeCircle {
    public static void main(String args[]) {
        Circle4 c = new Circle4(1.5);
        System.out.println(c.getArea());

        c.setRad(2.5);
        System.out.println(c.getArea());

        c.setRad(-3.3);
        System.out.println(c.getArea());
 
        c.rad = -4.5;
        System.out.println(c.getArea());
    }
}