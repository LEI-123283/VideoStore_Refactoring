package refactoring;

public class Movie {
	private String _title;
	private price _price;  // substitui Code

	public Movie(String title, price.Code priceCode) {
		_title = title;
		_price = new price(priceCode);
	}

	public double getRentalAmount(int daysRented) {
		return _price.getRentalAmount(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}

	public String getTitle() {
		return _title;
	}

	public price.Code getPriceCode() {
		return _price.getPriceCode();
	}
}
