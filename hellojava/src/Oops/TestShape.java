package Oops;

public class TestShape {
public static void main(String[] args) {
	 
	Shape sw = new Shape ();
	
	sw.setBorderWidth(5);
	sw.setColor("black");
	
	System.out.println(sw.getBorderWidth());

	String c = sw.getColor();
	
	System.out.println(c);
}
}
