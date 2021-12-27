package Exercise;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int no=153,t1,leng=0;
		
		t1=no;
		while(t1!=0) {
			t1=t1/10;
			leng = leng+1;
			
		}
	int t2=no,rem,arm=0;
	
	while(t2!=0) {
		rem=t2%10;
		int mull=1;
		for (int i=1; i<=leng; i++) {
			
			mull = mull*rem;
			
		}
		
		arm=arm+mull;
		t2=t2/10;
		
	
	}
	if(arm==no) { 
		System.out.println("number is armstrong");
	}else {
		
		System.out.println("number is not armstrong");
	}
	
		
	}

}
