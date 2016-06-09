package strategy;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class StrategyTest {

    @Test
    public void calulateTaxTest() {
        Double price = 100.0;
        CityTax cityTax = new CityTax();
        FederalTax federalTax = new FederalTax();
        Invoice invoice = new Invoice(price);
        Double total = cityTax.calculate(invoice) + federalTax.calculate(invoice);
        Double result = 16.0;
        TestCase.assertEquals(total, result);
    }
}
