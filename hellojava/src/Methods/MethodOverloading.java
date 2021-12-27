package Methods;

public class MethodOverloading {
	
	public void add(int a,int b){
		
		System.out.println(a+b);
	}
public void add(int a,int b,int c){
		
		System.out.println(a+b+c);
}
public void add(double a,int b){
	
	System.out.println(a+b);
}
public void add(int a,float b){
	 
	System.out.println(a+b);
}
public static void main(String[] args) {
	 
	MethodOverloading m= new MethodOverloading();
	m.add(12, 55);
	m.add(12, 7);
}
}