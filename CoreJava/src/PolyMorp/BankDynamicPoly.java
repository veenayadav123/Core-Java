package PolyMorp;

public class BankDynamicPoly {

	public double interestRate() {

		return 11.0;
	}

	public String getName() {

		return "RBI";
	}

}

 class AxisBank extends BankDynamicPoly {

	public double interestRate() {

		return 11.25;
	}

	public String getName() {

		return "Axis Bank";
	}
}

class HDFCBank extends BankDynamicPoly {

	public double interestRate() {

		return 10.10;
	}

	public String getName() {

		return "HDFC Bank";
	}
}

class ICICIBank extends BankDynamicPoly {

	public double interestRate() {

		return 9.75;
	}

	public String getName() {

		return "ICICI Bank";
	}
} 

