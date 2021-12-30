package exception;

public class Accounts {
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
	public double setBalance(double balance) {
		return this.balance = balance;
		
	}
	public void widhdrawal (double w) {
	    balance= balance-w;	
	    System.out.println("withdrowl ........" + w);
	}
	
}
