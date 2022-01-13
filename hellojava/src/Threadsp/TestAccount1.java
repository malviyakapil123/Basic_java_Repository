package Threadsp;

public class TestAccount1 extends Thread {
 
	public static Account1 acc = new Account1();
		private String name;
		
	public TestAccount1(String n){
		name=n;
	}

	@Override
	public void run() {
	for (int i = 0; i < 5; i++) {
		acc.deposit(name, 1000);
	}
	
	}
     public static void main(String[] args) {
	TestAccount1 t1 = new TestAccount1("yash");
	TestAccount1 t2 = new TestAccount1("kapil");
	
	t1.start();
	t2.start();
	
}
}
