package chainOfResponsability;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class ChainOfResponsabilityTest {

    @Test
    public void testWithoutDiscount(){
        DiscountCalculator calculator = new DiscountCalculator();

        Order order = new Order();
        order.addItem(new Item("ITEM A", 250.0));
        order.addItem(new Item("ITEM B", 250.0));

        double discount = calculator.calculate(order);
        double expectedResult = 0.0;

        TestCase.assertEquals(discount, expectedResult);
    }

    @Test
    public void testDiscountFiveItensLessThan500(){
        DiscountCalculator calculator = new DiscountCalculator();

        Order order = new Order();
        order.addItem(new Item("ITEM 1", 10.0));
        order.addItem(new Item("ITEM 2", 10.0));
        order.addItem(new Item("ITEM 3", 10.0));
        order.addItem(new Item("ITEM 4", 10.0));
        order.addItem(new Item("ITEM 5", 10.0));
        order.addItem(new Item("ITEM 6", 10.0));

        double discount = calculator.calculate(order);
        TestCase.assertTrue(discount == 0.0);
    }

    @Test
    public void testDiscountFiveItensMoreThan500(){
        DiscountCalculator calculator = new DiscountCalculator();

        Order order = new Order();
        order.addItem(new Item("ITEM 1", 200.0));
        order.addItem(new Item("ITEM 2", 200.0));
        order.addItem(new Item("ITEM 3", 200.0));
        order.addItem(new Item("ITEM 4", 200.0));
        order.addItem(new Item("ITEM 6", 100.0));
        order.addItem(new Item("ITEM 7", 100.0));

        double discount = calculator.calculate(order);
        TestCase.assertTrue(discount == 200);
    }

    @Test
    public void testDiscountOtherBiggerThan500(){
        DiscountCalculator calculator = new DiscountCalculator();

        Order order = new Order();
        order.addItem(new Item("ITEM A", 1000.0));

        double discount = calculator.calculate(order);
        TestCase.assertTrue(discount == 100);
    }
}
