package v0;

public class Movie {

	public enum Code { REGULAR, CHILDRENS, NEW_RELEASE }

	private String _title;
	private Code _priceCode;

	public Movie(String title, Code priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public String getTitle() {
		return _title;
	}

	public Code getPriceCode() {
		return _priceCode;
	}

	public double calculateAmount(int daysRented) {
		double amount = 0;
		switch (_priceCode) {
			case REGULAR:
				amount += 2;
				if (daysRented > 2)
					amount += (daysRented - 2) * 1.5;
				break;
			case NEW_RELEASE:
				amount += daysRented * 3;
				break;
			case CHILDRENS:
				amount += 1.5;
				if (daysRented > 3)
					amount += (daysRented - 3) * 1.5;
				break;
		}
		return amount;
	}
}
