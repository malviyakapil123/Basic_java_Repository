package exception;

public class TestAccount {

public static void main(String[] args) {
	
	Accounts h = new Accounts();

	h.setAccountType("current");
	
	h.setNumber("2646415646145456121");

	System.out.println(h.getAccountType());
	
	System.out.println(h.getNumber());

	try {
		h.setBalance(5000);
		h.widhdrawal(4800);
		auth(h.getBalance());
		
		System.out.println("Total Balance" +h.getBalance());
	} catch (InsufficientFund e) {
		
		System.err.println(e.getMessage());
	}
	
}
  public static void auth(double balance) throws InsufficientFund{
	  
	  if(balance<500){
		  InsufficientFund f = new InsufficientFund();
		  
		  throw f;
		  
	  }
	  
  }
	
}
