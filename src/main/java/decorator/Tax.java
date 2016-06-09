package decorator;

/**
 * Created by camilamacedo on 6/7/16.
 */
public abstract class Tax {

    private final Tax otherTax;

    public Tax(Tax otherTax) {
        this.otherTax = otherTax;
    }

    // construtor default
    public Tax() {
        this.otherTax = null;
    }

    protected double calculateOtherTax(Invoice invoice) {
        // If don't exist exist
        if(otherTax == null) return 0;
        return otherTax.calculate(invoice);
    }

    public abstract double calculate(Invoice invoice);

}
