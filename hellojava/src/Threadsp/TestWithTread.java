package Threadsp;

public class TestWithTread {

	public static void main(String[] args) {
		
		WithTread t1 = new WithTread(" fahim ");
		WithTread t2 = new WithTread(" kapil ");
		
		t1.start();
		t2.start();
		
		t1.setPriority(10);
		t2.setPriority(2);
	}

}
