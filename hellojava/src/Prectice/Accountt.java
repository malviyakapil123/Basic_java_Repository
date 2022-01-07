package Prectice;

public class Accountt {

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
	
	public void fundTransfer(double f)    {
		balance = balance-f;
		System.out.println("fundtransfer.."+ f);
		
		
		
	}

	
}
