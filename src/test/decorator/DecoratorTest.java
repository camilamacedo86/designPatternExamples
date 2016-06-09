package decorator;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        Tax taxComplexy = new CityTax(new FederalTax());
        Invoice invoice = new Invoice(1000.0);
        double result = taxComplexy.calculate(invoice);
        TestCase.assertEquals(result, 150);
    }
}
