package refactoring;

public class NewReleasePrice extends price {
    public NewReleasePrice() {
        super(Code.NEW_RELEASE);
    }

    @Override
    public double getRentalAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
