package jdk_8;
@FunctionalInterface
public interface Helloint {
	//public void add(int a, int b);
	public int add(int a, int b);
	
	public default void defmethod(){
		System.out.println("Default Method");
	}
	public static void staticmethod(){
		System.out.println("Static Method");
		
	}

}
