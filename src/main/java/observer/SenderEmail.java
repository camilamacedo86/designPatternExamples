package observer;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class SenderEmail implements ActionsAfterCloserInvoice {

    public void execute(Invoice invoice){
        // Here the implementation to send email
        System.out.println("-> Send email");
    }
}
