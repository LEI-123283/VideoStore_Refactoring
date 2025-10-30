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

	public int getDaysRented()
	{
		return _daysRented;
	}

	public Movie getMovie()
	{
		return _movie;
	}
}
