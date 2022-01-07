package Collectionex;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercixe_5 {

	public static void main(String[] args) {
		ArrayList a= new ArrayList<>();
		
		for (int i=1; i<=100000; i++){
			
			a.add(i);
			
		}
		
		
		HashSet h = new HashSet<>();
		h.addAll(a);
		
		System.out.println(h);
		
		
		
	}



	
	

}
