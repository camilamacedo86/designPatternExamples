package decorator;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class CityTax extends Tax {

    public CityTax(Tax otherTax) {
        super(otherTax);
    }

    public CityTax(){}

    @Override
    public double calculate(Invoice invoice) {
        return invoice.getValue() * 0.1 + this.calculateOtherTax(invoice);
    }



}
