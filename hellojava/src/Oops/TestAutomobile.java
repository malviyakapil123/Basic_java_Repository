package Oops;

public class TestAutomobile {
public static void main(String[] args) {
	
	Automobile a= new Automobile();
	
	a.setColor("white");
	a.setSpeed(20);
	a.setMake("Tata");
	a.changeGear();
	
	
	
	System.out.println(a.getColor());
	System.out.println(a.getSpeed());
	System.out.println(a.getMake());
	
}
}
