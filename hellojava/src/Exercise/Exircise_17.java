package Exercise;

public class Exircise_17 {
	public static void main(String[] args) {
		int sum=0,sum1=0;
		int a [] ={12,15,14,78,13,45,16,18};
		int b [] ={12,15,14,78,13,45,16};
		
		for (int i=0; i<=a.length-1; i++){
			sum=sum+a[i];
			//System.out.println(sum);
		}
		for(int j=0; j<=b.length-1; j++){
			sum1=sum1+b[j];
			//System.out.println(sum1);
		
		
	}int h= sum-sum1;
	System.out.println(h);
	}

}
