package interfaces;

public class TestBussinessman {
public static void main(String[] args) {
	Richman r= new Bussinessman();
	SocialWorker s = new Bussinessman();
	
	r.donation();
	r.earnmoney();
	r.party();
	s.helpToOther();
}
}
