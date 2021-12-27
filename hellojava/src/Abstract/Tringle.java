package Abstract;

public class Tringle extends Shape {
	private int base;
	private int height;
	
	
	
	public Tringle(){
		
	}
	public Tringle(int b,int h){
		base=b;
		height =h;
	}
	
	
	public int getBase() {
		return base;
	}
	
	public int getHeight() {
		return height;
	
	}
	public double area(){
		double art=0.5*base*height;
		System.out.println("Area of Tringle"+" = "+art);
		return art;
	}
}
