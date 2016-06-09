package decorator;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class FederalTax extends Tax {

    public FederalTax(Tax otherTax) {
        super(otherTax);
    }

    public FederalTax(){}

    @Override
    public double calculate(Invoice invoice) {
        return invoice.getValue() * 0.05 + this.calculateOtherTax(invoice);
    }

}
