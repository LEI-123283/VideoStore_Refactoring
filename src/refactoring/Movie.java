package refactoring;

public class Movie {
	private String _title;
	private price _price;

	public Movie(String title, price.Code priceCode) {
		_title = title;
		setPriceCode(priceCode);
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

	public void setPriceCode(price.Code code) {
		switch (code) {
			case REGULAR:
				_price = new RegularPrice();
				break;
			case CHILDRENS:
				_price = new ChildrensPrice();
				break;
			case NEW_RELEASE:
				_price = new NewReleasePrice();
				break;
		}
	}
}
