package date;

public class Copychar {
public static void main(String[] args) {
	char [] ch = {'a','h','v','g','f','g','k','b','d','s','c','d'};
	
	char [] cp = new char [11];
	
	System.arraycopy(ch, 2, cp, 0, 6);
			
	for(char c:ch) {
		System.out.println(c);
	}
	
	
	
}
}
