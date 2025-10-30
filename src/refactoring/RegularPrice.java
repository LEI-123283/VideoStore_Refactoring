package refactoring;

public class RegularPrice extends price {
    public RegularPrice() {
        super(Code.REGULAR);
    }

    @Override
    public double getRentalAmount(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }
}
