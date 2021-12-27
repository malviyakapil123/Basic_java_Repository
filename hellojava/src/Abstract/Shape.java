package Abstract;

public abstract class Shape {
	private int borderWidth;
	private String color;
    
	public Shape() {
		
	}
	 
	public Shape(String c, int w) {
		
		color=c;
		borderWidth=w;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	
	
	public String getColor() {
		return color;
	}
	public abstract double area();
}
