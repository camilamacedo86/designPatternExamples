package observer;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class SendSMS implements ActionsAfterCloserInvoice {

    public void execute(Invoice invoice){
        // Here the implementation to send a sms
        System.out.println("-> Send Sms");
    }
}
