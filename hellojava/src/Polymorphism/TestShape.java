package Polymorphism;

public class TestShape {

	public static void main(String[] args) {
		Shape sa= new Rectangle(5,10);
		
		sa.area();
	System.out.println(sa.getColor());	
	System.out.println(sa.getBorderWidth());
    
	}

}
