package state;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class StateTest {

    @Test
    public void testDiscountExtra(){
        Order order = new Order(100.0);

        // Apply 10% discount because the state is Progress
        order.applyDiscountExtra();
        TestCase.assertEquals(order.value, 90.0);
        // Aprove Order
        order.approve();
        // Apply 5% discount because the state is Progress
        order.applyDiscountExtra();
        TestCase.assertEquals(order.value, 85.5);
        order.finish();

        // If you call now applyDiscountExtra()
        // you will receive a RunTimeException

        try{
            order.applyDiscountExtra();
        }catch (RuntimeException r){
            TestCase.assertTrue(true);
        }
    }

}
