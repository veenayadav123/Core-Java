package Interface;

public class Businessman1 implements Richman,SocialWorker {

	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void earnMoney() {
		System.out.println("This is earnmoney");
	}

	@Override
	public void party() {
		System.out.println("this is party");
	}

	public void donation() {

		System.out.println("Giving Donation");
	}

	@Override
	public void helpToOthers() {
	
		System.out.println("Help to other");
		
	}

}
