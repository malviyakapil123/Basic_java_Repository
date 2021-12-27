package Exercise;

public class Pelindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int no=121,temp;
		int rem=0,rev=0;
		
		 temp=no;
		
		while(temp!=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(no==rev) 
		{System.out.println("number is pelindrom");
			
		}else 
		{
		    System.out.println("number is not pelindrom");	
		}
		
		
	}

}
