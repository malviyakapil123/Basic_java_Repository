package collectionFramework;

public class Marksheet implements Comparable<Marksheet>{

	private String Rollno;
	private String Fname;
	private String Lname;
	private int Physics;
	private int Chemistry;
	private int Maths;
	
	public Marksheet(){
		
	}
public Marksheet(String r,String f,String l,int p,int c , int m){
		
	Rollno=r;
	Fname = f;
	Lname = l;
	Physics = p;
	Chemistry = c;
	Maths = m;
	
	}
public String getRollno() {
	return Rollno;
}
public String getFname() {
	return Fname;
}
public String getLname() {
	return Lname;
}
public int getPhysics() {
	return Physics;
}
public int getChemistry() {
	return Chemistry;
}
public int getMaths() {
	return Maths;
}
public int compareTo(Marksheet o) {
	
	return this.Rollno.compareTo(o.Rollno);
}
	
	
}
