package v9;

public class ChildrensPrice extends Price {

	@Override
	public double getRentalAmount(int duration) {
		return 1.5 + (duration > 3 ? (duration - 3) * 1.5 : 0);
	}

	@Override
	public int getFrequentRentalPoints(int duration) {
		return 1;
	}
}
