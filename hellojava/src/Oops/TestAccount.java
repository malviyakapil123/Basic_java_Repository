package Oops;

public class TestAccount {
 
	public static void main(String[] args) {
		
		Account a= new Account();
		
		
		
	    
		
		a.setNumber("1234567890");
		a.setAccountType("current");
		a.setBalance(1500.20);
	    a.widhdrawal(120.6);
		a.deposit(250.3);
		a.fundTransfer(500);
		a.paybill(50);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
	    System.out.println(a.getBalance());
	    
	   
	}

        
        	
        }





