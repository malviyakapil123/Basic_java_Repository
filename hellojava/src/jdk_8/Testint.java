package jdk_8;

public class Testint {

	public static void main(String[] args) {
		
		Helloint h= (a,b) -> {
			
			return a+b;
		};//h.add(5,8);
		int c=h.add(5,8);
		System.out.println(c);
		
         h.defmethod();
         Helloint.staticmethod();
	}

}
