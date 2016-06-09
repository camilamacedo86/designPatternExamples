package observer;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class ObserverTest {

    @Test
    public void builderTest(){

        BuilderInvoice invoice = new BuilderInvoice();
        invoice.addActions( new EmailDAO() )
        .addActions( new Printer() )
        .addActions( new SenderEmail() )
        .addActions( new SendSMS() );

        invoice.addItem("ITEM A", 20.0)
        .addItem("ITEM B", 25.0)
        .addItem("ITEM C", 4.0)
        .addItem("ITEM D", 8.50)
        .addDiscount("B2B", 10)
        .addDiscount("Week Promotion", 5)
        .addObservations("Order Late")
        .close();

        TestCase.assertFalse(true);
    }
}
