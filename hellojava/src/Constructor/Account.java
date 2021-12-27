package Constructor;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	  
	public Account() {
		
	}
	public Account(String a, String n, double b) {
		
		accountType=a;
		number=n;
		balance=b;
		
		
	}
	public String getNumber() {
		return number;
	}
	
	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void widhdrawal(double w) {
	    balance= balance-w;	
	    System.out.println("withdrowl ........"+balance);
	}
	public void deposit(double d) {
		balance=balance+d;
		System.out.println("deposite......."+balance);

	}
	public void paybill(double p) {
		balance =balance-p;
       System.out.println("paybill..."+balance);
	}
	public void fundTransfer(double f) {
		balance = balance-f;
		System.out.println("fundtransfer.."+balance);
		
	}
}
