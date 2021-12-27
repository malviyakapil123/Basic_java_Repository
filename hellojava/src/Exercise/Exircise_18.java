package Exercise;

public class Exircise_18 {
	public static void main(String[] args) {
		int [] a ={4,12,78,45,12,46,23,42,92,21};
		int x=15;
		boolean fountNumber = false;
		for (int i=0; i<=a.length; i++){
			if (a[i]==x){
				System.out.println("Position of x is"+(i+1));
				fountNumber = true;
				break;
				
			}
			if(fountNumber == false);
			System.out.println("Number could not foundNumber,-1");
			
		}

	}
	
}
