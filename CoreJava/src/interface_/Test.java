package interface_;

public class Test {
	
	public static void main(String[] args) {
		
		Richman rm = new Businessman1();
		
		SocialWorker sw = (SocialWorker)new Businessman1();
		
		Businessman1 bm = new Businessman1();
		
		rm.donation();
		rm.earnMoney();
		sw.helpToOthers();
		bm.party();
	}

}
