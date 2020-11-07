package Keywords;

interface bank {
	float rateofIntereset();

}

class SBI implements bank {

	@Override
	public float rateofIntereset() {
		// TODO Auto-generated method stub
		return 9.15f;
	}
}

class AXIS implements bank {

	@Override
	public float rateofIntereset() {
		// TODO Auto-generated method stub
		return 11.12f;
	}
}

class InterfaceKeyword2 {
	public static void main(String[] args) {
		SBI IK = new SBI();

		IK.rateofIntereset();
		System.out.println(IK.rateofIntereset());
	}
}
