package v9;

public class RegularPrice extends Price {

	@Override
	public double getRentalAmount(int duration) {
		return 2 + (duration > 2 ? (duration - 2) * 1.5 : 0);
	}

	@Override
	public int getFrequentRentalPoints(int duration) {
		return 1;
	}
}
