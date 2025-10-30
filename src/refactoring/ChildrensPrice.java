package refactoring;

public class ChildrensPrice extends price {
    public ChildrensPrice() {
        super(Code.CHILDRENS);
    }

    @Override
    public double getRentalAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }
}
