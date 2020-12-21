package MethodOverriding;

public class InterestRateofBanks {

	public static void main(String[] args) {
		InterestRateofBanks IR = new InterestRateofBanks();
		AXISInterestRate AX = new AXISInterestRate();
		AX.interestRate();

		SBIInterestRate SR = new SBIInterestRate();
		SR.interestRate();
	}

}
