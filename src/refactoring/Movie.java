package refactoring;

public class Movie {

	public double getRentalAmount(int daysRented) {
		double thisAmount = 0;

		switch (getPriceCode()) {
			case REGULAR:
				thisAmount += 2;
				if (daysRented > 2)
					thisAmount += (daysRented - 2) * 1.5;
				break;
			case NEW_RELEASE:
				thisAmount += daysRented * 3;
				break;
			case CHILDRENS:
				thisAmount += 1.5;
				if (daysRented > 3)
					thisAmount += (daysRented - 3) * 1.5;
				break;
		}
		return thisAmount;
	}

	public int getFrequentRenterPoints(int daysRented) {
		int points = 1;
		if ((getPriceCode() == Movie.Code.NEW_RELEASE) && daysRented > 1)
			points++;
		return points;
	}



	public enum Code {REGULAR, CHILDRENS, NEW_RELEASE};
	
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
}
