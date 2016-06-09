package templateMethod;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class TemplateMethodTest {

    @Test
    public void calulateCityTaxMaximumRateTest() {
        Invoice invoice = new Invoice();
        invoice.addItem(new Item("ITEM 1", 1000.0));
        Double result = new CityTax().calculate(invoice);
        Double resultCityTexExp = invoice.getValue() * 0.1;
        TestCase.assertEquals(result, resultCityTexExp);
    }

    @Test
    public void calulateCityTaxMinimumRateTest() {
        Invoice invoice = new Invoice();
        invoice.addItem(new Item("ITEM 1", 100.0));
        Double result = new CityTax().calculate(invoice);
        Double resultCityTexExp = invoice.getValue() * 0.6;
        TestCase.assertEquals(result, resultCityTexExp);
    }

    @Test
    public void calulateFederalTaxMaximumRateTest() {
        Invoice invoice = new Invoice();
        invoice.addItem(new Item("ITEM 1", 800.0));
        Double result = new FederalTax().calculate(invoice);
        Double resultCityTexExp = invoice.getValue() * 0.7;
        TestCase.assertEquals(result, resultCityTexExp);
    }

    @Test
    public void calulateFederalTaxMinimumRateTest() {
        Invoice invoice = new Invoice();
        invoice.addItem(new Item("ITEM 1", 300.0));
        Double result = new FederalTax().calculate(invoice);
        Double resultCityTexExp = invoice.getValue() * 0.5;
        TestCase.assertEquals(result, resultCityTexExp);
    }

}
