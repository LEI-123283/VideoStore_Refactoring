package v0;

public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	// métodos de instância
	public double getThisAmount() {
		return _movie.calculateAmount(_daysRented);
	}

	public int getFrequentRenterPoints() {
		int points = 1;
		if (_movie.getPriceCode() == Movie.Code.NEW_RELEASE && _daysRented > 1)
			points++;
		return points;
	}
}
