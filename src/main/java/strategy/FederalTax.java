package strategy;
/**
 * Created by camilamacedo on 6/7/16.
 */
public class FederalTax implements Tax {

    @Override
    public double calculate(Invoice invoice) {
        return invoice.getValue() * 0.06;
    }
}
