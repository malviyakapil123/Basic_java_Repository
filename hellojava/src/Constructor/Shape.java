package Constructor;

public class Shape {
	public static final double PI=3.14;
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
	
	
}
