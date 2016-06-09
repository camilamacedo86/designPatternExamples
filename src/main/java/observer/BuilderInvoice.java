package observer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class BuilderInvoice {

    private Invoice invoice ;
    private List<ActionsAfterCloserInvoice> actionsAfterCloserInvoices ;
    public BuilderInvoice() {
        actionsAfterCloserInvoices = new ArrayList<>();
        invoice = new Invoice();
        invoice.setDate(LocalDate.now());
        invoice.setOrder(new Order());
        invoice.getOrder().setDate(invoice.getDate());
    }

    public BuilderInvoice addItem(String name, double value) {
        invoice.getOrder().getItemList().add(new Item(name,value));
        return this;
    }

    public BuilderInvoice addDiscount(String desc, double por) {
        invoice.getDiscountList().add(new Discount(desc,por));
        return this;
    }

    public BuilderInvoice changeDateOrder(LocalDate date) {
        invoice.getOrder().setDate(date);
        return this;
    }

    public BuilderInvoice addObservations(String obs) {
        invoice.getOrder().setObservations(obs);
        return this;
    }

    public BuilderInvoice close(){
        double valueDiscount = (invoice.getOrder().getTotalValue() * invoice.getTotalDisountPorcentage())/100;
        double totalValue =  invoice.getOrder().getTotalValue() - valueDiscount;
        invoice.setTotalInvoice(totalValue);
        invoice.setFinishDate(LocalDate.now());
        invoice.setDatePayment(invoice.getFinishDate().plus(5, ChronoUnit.DAYS));
        actions();
        return this;
    }

    // Here we call the actions --> observers
    private void actions(){
        actionsAfterCloserInvoices.stream().forEach(a-> a.execute(this.invoice));
    }

    public BuilderInvoice addActions(ActionsAfterCloserInvoice actionsAfterCloserInvoice){
        this.actionsAfterCloserInvoices.add(actionsAfterCloserInvoice);
        return this;
    }

}
