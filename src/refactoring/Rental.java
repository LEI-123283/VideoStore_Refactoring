package refactoring;

import v0.Movie;

public class Rental
{
	private v0.Movie _movie;
	private int      _daysRented;

	public Rental(v0.Movie movie, int daysRented)
	{
		_movie = movie;
		_daysRented = daysRented;
	}

	public double getAmount() {
		double thisAmount = 0;

		switch (getMovie().getPriceCode())
		{
			case REGULAR:
				thisAmount += 2;
				if (getDaysRented() > 2)
					thisAmount += (getDaysRented() - 2) * 1.5;
				break;
			case NEW_RELEASE:
				thisAmount += getDaysRented() * 3;
				break;
			case CHILDRENS:
				thisAmount += 1.5;
				if (getDaysRented() > 3)
					thisAmount += (getDaysRented() - 3) * 1.5;
				break;
		}
		return thisAmount;
	}


	public int getFrequentRenterPoints() {
		int frequentRenterPoints = 1;
		// add bonus for a two day new release rental
		if ((getMovie().getPriceCode() == Movie.Code.NEW_RELEASE) && getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

	public int getDaysRented()
	{
		return _daysRented;
	}

	public Movie getMovie()
	{
		return _movie;
	}
}
