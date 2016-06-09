package observer;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class EmailDAO implements ActionsAfterCloserInvoice {

    public void execute(Invoice invoice){
        System.out.println("-> Persist in the database");
        // Here the implementation to persist in the database
    }
}
