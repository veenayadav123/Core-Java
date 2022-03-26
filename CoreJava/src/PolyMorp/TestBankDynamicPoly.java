package polyMorp;

public class TestBankDynamicPoly {

	public static void main(String[] args) {

		BankDynamicPoly[] banks = new BankDynamicPoly[3];
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();

		loanEnquiry(banks);
	}

	static void loanEnquiry(BankDynamicPoly[] banks) {

		for (BankDynamicPoly b : banks) {
			String name = b.getName();
			double rate = b.interestRate();
			System.out.println(name + " = " + rate);
		}
	}

}
