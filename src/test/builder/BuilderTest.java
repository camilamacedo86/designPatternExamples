package builder;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class BuilderTest {

    @Test
    public void builderTest(){
        LocalDate yesteday = LocalDate.now().minus(1, ChronoUnit.DAYS);

        BuilderInvoice invoice = new BuilderInvoice();
        invoice.addItem("ITEM A", 20.0)
        .addItem("ITEM B", 25.0)
        .addItem("ITEM C", 4.0)
        .addItem("ITEM D", 8.50)
        .addDiscount("B2B", 10)
        .addDiscount("Week Promotion", 5)
        .addObservations("Order Late")
        .changeDateOrder(yesteday)
        .close()
        .emission();

        TestCase.assertFalse(true);
    }
}
