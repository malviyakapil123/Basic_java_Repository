package Oops;

public class Account {

	private String number;
	private String accountType;
	private double balance;
	  
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		
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
