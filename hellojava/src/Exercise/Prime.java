package Exercise;

public class Prime {

	public static void main(String[] args) {
		
     
		int a=41; int b=0;
		
		for(int i=2; i<a; i++) 
		{
			
			if(a%i==0) 
			{
				
				b=b+1;
			}
			
			
			
		} 
		if(b==0) 
		{
			System.out.println(a+"is prime number");
			
			
		}
		else 
		{
			System.out.println(a+"is not prime number");
		}
		
		
	}

}
