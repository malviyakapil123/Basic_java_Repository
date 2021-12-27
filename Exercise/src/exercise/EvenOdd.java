package exercise;

public class EvenOdd {
	
	public static void main(String[] args) {
		int sum = 0;
		int total = 0;
		System.out.println("This series is odd number");
	
		
		for (int i=1; i<=13; i+=2){
			System.out.println(i);
			total = total + 1;
			
			sum = sum + i;
			
		}
	       System.out.println("total sum"+sum);
	        System.out.println(sum/total);
	}
}
