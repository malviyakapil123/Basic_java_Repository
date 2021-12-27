package Construcrorcalling;

public class Person {

	protected String firstname;
    protected String lastname;
	protected String address;
	
	public Person(){
		System.out.println("default constructor");
	}
	public Person(String fn,String ln){
		firstname=fn;
		lastname=ln;
		System.out.println("2 perameterised constructor" + firstname + lastname);
	}
	public Person(String fn,String ln ,String add){
		this(fn, ln);
		address=add;
		System.out.println("3 perameterised constructor" + firstname + lastname + address);
	}
	public static void main(String[] args) {
		Person p = new Person("fahim", "ansari", "ratlam");
	}
}
