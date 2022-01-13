package Collectionex;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercixe_5 {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		ArrayList a = new ArrayList<>();

		for (int i = 1; i <= 100000; i++) {

			a.add(i);

		}

		HashSet h = new HashSet<>();
		h.addAll(a);

		System.out.println(h);
		
		for (int j =0; j<=50; j++){
			
			System.out.println("Is a contains Arraylist    " + a.contains(j));
			
		}
		System.out.println("Time Taken By Hashset   "+System.currentTimeMillis());
       for(int k=0; k<=50; k++){
    	   
    	   System.out.println("Is a contains Hashset     " + h.contains(k));
       }
       System.out.println("Time Taken By Hashset    "+(System.currentTimeMillis()));
	}

}
