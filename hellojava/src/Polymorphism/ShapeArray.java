package Polymorphism;

public class ShapeArray {
 public static void main(String[] args) {
	
	 Shape [] sp= new Shape [3];
	
		 
		sp[0]= new Circle(5);
		sp[1]= new Rectangle(10,12);
		sp[2]=new Tringle(45,12);
		
		double totalarea= clcarea(sp);
		System.out.println("The Total area "+"  =  "+totalarea);
	
}
 public static double clcarea(Shape[]sp){
	 double totalarea=0;
	 for (int i=0; i<=sp.length-1; i++){	
		  totalarea += sp[i].area();
			
	 }
	 return totalarea;
 }
}
