package Constructor;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Shape("red",5);
		
      System.out.println(s.getColor());
      System.out.println(s.getBorderWidth());
      System.out.println(s.PI);
      
	}

}
