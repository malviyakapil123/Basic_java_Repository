package Exercise;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int a=0,b=1,c,i,count=15;
		
		System.out.println(a+" "+b);
		
		for(i=2; i<count; ++i) {
			
			c=a+b;
			System.out.print("  "+c);
		
		  a=b;
          b=c; 		
		}
		
		
		
		
		
	}

}
