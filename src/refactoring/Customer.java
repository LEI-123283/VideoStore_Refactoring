package refactoring;

import java.util.Vector;

public class Customer
{
	private String            _name;
	private Vector<Rental>    _rentals    = new Vector<Rental>();

	public Customer(String _name)
	{
		this._name = _name;
	}

	public void addRental(Rental arg)
	{
		_rentals.addElement(arg);
	}

	public String getName()
	{
		return _name;
	}

	public String statement()
	{
		// header
		String result = "Rental Record for " + getName() + "\n";

		for (Rental each : _rentals)
		{
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + each.getMovie().getRentalAmount(each.getDaysRented()) + "\n";
		}

		// add footer lines
		result += "Amount owed is " + getTotalAmount() + "\n";
		result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
		return result;
	}

	public String htmlStatement()
	{
		String result = "<h1>Rentals for <em>" + getName() + "</em></h1><p>\n";

		for (Rental each : _rentals)
		{
			result += each.getMovie().getTitle() + ": " + each.getMovie().getRentalAmount(each.getDaysRented()) + "<br>\n";
		}

		result += "<p>You owe <em>" + getTotalAmount() + "</em><p>\n";
		result += "On this rental you earned <em>" + getTotalFrequentRenterPoints() + "</em> frequent renter points<p>";
		return result;
	}


	private double getTotalAmount() {
		double totalAmount = 0;
		for (Rental each : _rentals) {
			totalAmount += each.getMovie().getRentalAmount(each.getDaysRented());
		}
		return totalAmount;
	}

	private int getTotalFrequentRenterPoints() {
		int frequentRenterPoints = 0;
		for (Rental each : _rentals) {
			frequentRenterPoints += each._movie.getFrequentRenterPoints(each.getDaysRented());
		}
		return frequentRenterPoints;
	}

}
