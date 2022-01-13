package Threadsp;

public class WithRunnable extends WithTread implements Runnable {

	public WithRunnable(String n) {
		super(n);

	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);

		}

	}

	public static void main(String[] args) {
		WithTread wt = new WithTread(" java");
		WithTread wv = new WithTread(" kapil");
		Thread th = new Thread(wt);
		Thread t2 = new Thread(wv);
		th.start();
		t2.start();
	}

}
