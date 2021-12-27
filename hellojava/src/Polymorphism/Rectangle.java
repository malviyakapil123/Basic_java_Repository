package Polymorphism;

public class Rectangle extends Shape{

	 private int width;
	 private int length; 
	 
	
	 
	 public Rectangle(){
		 
	 }
	 public Rectangle (int l, int w){
		 
		 length=l;
		 width=w;
		 
	 }
	 
	public int getWidth() {
		return width;
	}
	
	
	public int getLength() {
		return length;
	}
	public double area (){
		int arr = length*width;
		System.out.println("Area of Rectangle"+" = "+arr);
		return arr;
	}
	
	 
}
