package Threadsp;

public class HelloWithoutTreads {

	private String name =null;
	
	public HelloWithoutTreads() {
	
	}
	public HelloWithoutTreads(String n) {
		name=n;
	}
	
	public void run(){
		for (int i=0; i<20; i++){
			System.out.println(i+ "   " + name);
		}
		
	}
	
	
}
