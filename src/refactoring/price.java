package refactoring;

public abstract class price {
    public enum Code {REGULAR, CHILDRENS, NEW_RELEASE}

    private Code _priceCode;

    public price(Code code) {
        _priceCode = code;
    }

    public Code getPriceCode() {
        return _priceCode;
    }

    // métodos abstratos (cada subclasse vai implementá-los)
    public abstract double getRentalAmount(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1; // valor padrão
    }
}
