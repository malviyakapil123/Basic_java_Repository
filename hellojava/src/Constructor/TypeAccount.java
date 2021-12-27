package Constructor;

public class TypeAccount {

	public static void main(String[] args) {
		Account a= new Account("current","2546357812",1500.25);
		
		System.out.println(a.getAccountType());
        System.out.println(a.getNumber());
        System.out.println(a.getBalance());
	}

}
