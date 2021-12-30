package exception;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			

			double div = 12 /0 ;
			
			System.out.println(div);

		}catch (ArithmeticException f) {

			System.out.println("divide by zero are not applicable");
			System.exit(0);
		}
         
		 

		finally {
			System.out.println("output");
		}
	}

}
