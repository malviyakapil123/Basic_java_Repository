package collectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Itratortest {

	public static void main(String[] args) {
	
		ArrayList v =new ArrayList();
		
		v.add(12);
		v.add(125);
		v.add(652);
		v.add(11);
		v.add(125);
		v.add(945);
		v.add(3654);
		v.add(56361);
		v.add(1854);
		v.add(189);
		
		/*Enumeration k = v.elements();
		
		while (k.hasMoreElements()) {
			Object object = (Object) k.nextElement();
			System.out.println(object);
		}*/
		
		Iterator j = v.iterator();
		

		while (j.hasNext()) {
			Object object = (Object) j.next();
			System.out.println(object);
			
		}
		
Iterator j1 = v.iterator();
		

		if(j1.hasNext()) {
try {
							j1.remove();
			} catch (Exception e) {
				System.out.println("list over");
			}
		}
		
		
	}

}
