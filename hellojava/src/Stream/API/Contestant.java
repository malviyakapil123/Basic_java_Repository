package Stream.API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Contestant {
	
	public String name = null;
	public String  Phone =null;
	
	public Contestant(String n,String p ) {
		
		name =n;
		Phone =p;
		
	}
	public static void main(String[] args) {
		
		ArrayList<Contestant> A = new ArrayList<Contestant>();
		
		A.add(new Contestant("Kapil", "9407411301"));
		A.add(new Contestant("Yash", "9405248752"));
		A.add(new Contestant("Fahim", "9955124895"));
		A.add(new Contestant("Deeraj", "6265897577"));
		A.add(new Contestant("Amar", "9254625"));
		A.add(new Contestant("Rohan", "5624851301"));
		A.add(new Contestant("Mayank", "9407511301"));
		A.add(new Contestant("Vishu", "9405221301"));
		A.add(new Contestant("Ram", "9407411501"));
		
		A.stream().map(e -> e.name).filter(e -> e.length()==5).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(e -> System.out.println(e));
		
	}

}
