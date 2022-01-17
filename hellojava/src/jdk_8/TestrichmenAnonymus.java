package jdk_8;

public class TestrichmenAnonymus {

	public static void main(String[] args) {
		
		Richmen1 r= new Richmen1() {
			
			@Override
			public void party() {
				System.out.println("party");
				
			}

			@Override
			public void Earnmoney() {
				System.out.println("Earnmoney");
				
			}

			@Override
			public void donation() {
				System.out.println("donation");
				
			}
		};r.party();
		r.donation();
		r.Earnmoney();

	}

}
