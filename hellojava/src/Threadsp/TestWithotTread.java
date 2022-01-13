package Threadsp;

public class TestWithotTread {

	public static void main(String[] args) {
		
		HelloWithoutTreads h1 = new HelloWithoutTreads("msd");
		HelloWithoutTreads h2 = new HelloWithoutTreads("virat");
		
		h1.run();
		h2.run();
	}

}
