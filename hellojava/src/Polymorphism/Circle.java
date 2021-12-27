package Polymorphism;

public class Circle extends Shape {
	
	private int radius ;
	

	
	

	public Circle(){
		
	}
	public Circle(int r){
		
		radius=r;
		
	}
	public int getRadius() {
		return radius;
	
	}
	public double area(){
		
		double arc= 3.14*radius*radius;
		System.out.println("Area of Circle"+" = "+arc);
		return arc;
		
	}
	
	
	
	

}
