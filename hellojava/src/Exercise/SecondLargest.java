package Exercise;

public class SecondLargest {
public static void main(String[] args) {
		
		int [] a= {52,24,36,456,854,325,964,254,};
		int temp=0;
		for (int i=0; i < a.length; i++){
			for (int j=i+1; j<a.length; j++){
				if (a[i]>a[j]){
					
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					
				}
			}
		}
		int num =a.length-2;
		System.out.println(a[num]);

	}

}
