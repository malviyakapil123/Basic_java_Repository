package Polymorphism;

public class ShapeReturn {

	public static void main(String[] args) {
		
		Shape [] sp= new Shape [3];
		
		 
		/*sp[0]= new Circle(5);
		sp[1]= new Rectangle(10,12);
		sp[2]=new Tringle(45,12);*/
		for (int i=0; i<3; i++){
			
		 sp[i] = getShape(i+1);
			
		}
		
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
    public static Shape getShape(int i){
    	
    	if(i==1) return new Circle(12);
    	if(i==2)return new Rectangle(12,25);
    	if(i==3) return new Tringle(10,12);
    	
    	Shape sp =new Shape();
    	return sp;
    
    	
    	
    }
    

}
