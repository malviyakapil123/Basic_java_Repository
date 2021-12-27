package Construcrorcalling;

public class Employee extends Person {
	
	protected String Designation;
	
	public Employee() {
		System.out.println("defaul Construtor");
	}
	public Employee( String fn,String ln, String add,String deg) {
		super(fn, ln,add);
		Designation = deg;
		System.out.println("3 Peramerised Construtor"+ firstname + lastname + address + Designation);
	}

    public static void main(String[] args) {
	Person p = new Employee("kapil", "malviya", "khargone", "civil engineer");
}
}
