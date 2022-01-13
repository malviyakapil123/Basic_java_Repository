package Threadsp;

public class WithTread extends Thread{

	private String name =null;
	
	public WithTread(String n) {
		
		name=n;
		
	}
	public void run(){
		
		for (int i=0; i<20; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+ "   " + name);
	
}
}
}