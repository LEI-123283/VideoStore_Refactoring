package refactoring;

import v0.Movie;

public class Rental
{
	private v0.Movie _movie;
	private int		_daysRented;

	public Rental(v0.Movie movie, int daysRented)
	{
		_movie = movie;
		_daysRented = daysRented;
	}

	static double getAmount(v0.Rental each, double thisAmount) {
		switch (each.getMovie().getPriceCode())
		{
			case REGULAR:
				thisAmount += 2;
				if (each.getDaysRented() > 2)
					thisAmount += (each.getDaysRented() - 2) * 1.5;
				break;
			case NEW_RELEASE:
				thisAmount += each.getDaysRented() * 3;
				break;
			case CHILDRENS:
				thisAmount += 1.5;
				if (each.getDaysRented() > 3)
					thisAmount += (each.getDaysRented() - 3) * 1.5;
				break;
		}
		return thisAmount;
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
