package Exercise;

public class LargestNumber {
	public static void main(String[] args) {
		  
		int [] ar = {1,5,34,6,85,23,45,58,64,56,78};
		 
		int maxnumber= ar[0];
		
		for (int i=0; i<ar.length; i++){
			if (ar[i]>maxnumber){
				
				maxnumber=ar[i];
			}
			
			
		}System.out.println("The largest number"+maxnumber);

	}
}
