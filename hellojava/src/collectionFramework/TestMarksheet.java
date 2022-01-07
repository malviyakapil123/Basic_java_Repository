package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {

	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet("4", "kapil", "varma", 85, 62, 92);
		Marksheet m2 = new Marksheet("5", "yash", "malviya", 82, 63, 86);
		Marksheet m3 = new Marksheet("1", "dhiraj", "vishva", 52, 97, 45);
		Marksheet m4 = new Marksheet("3", "kapil", "karma", 48, 62, 75);
		Marksheet m5 = new Marksheet("2", "fahim", "anshari", 35, 52, 62);
		
		ArrayList<Marksheet> A = new ArrayList<Marksheet>();
		A.add(m1);
		A.add(m2);
		A.add(m3);
		A.add(m4);
		A.add(m5);
		
		
		Collections.sort(A,new Firstname());
		
		
		
		Iterator<Marksheet> it = A.iterator();
		while (it.hasNext()) {
			Marksheet m =  it.next();
			
			System.out.println(m.getRollno() +"  "+ m.getFname()+"  "+m.getLname()+"  "+m.getPhysics()+"  "+m.getChemistry()+"  "+m.getMaths());
		}
		
		
	}

}
