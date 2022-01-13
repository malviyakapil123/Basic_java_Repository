package Threadsp;

public class Account1 {

	private int Balance;

	// public synchronized void deposit(String msg, int amt){ type 1
	public void deposit(String msg, int amt) {
		synchronized (this) {
			int bal = getBalance();
			setBalance(bal + amt);
		

		System.out.println(msg + "show Balance :  " + getBalance());
		}
	}

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

}
