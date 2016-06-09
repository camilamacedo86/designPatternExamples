package builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class BuilderInvoice {

    private Invoice invoice = new Invoice();

    public BuilderInvoice() {
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
        return this;
    }

    public void emission(){
        System.out.println("*******************INVOICE**********************");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Invoice Date Emission :" + this.invoice.getFinishDate().format(formatter) );
        System.out.println("Invoice Date :" + this.invoice.getDate().format(formatter) );
        System.out.println("*******************ITEMS**********************");
        this.invoice.getOrder().getItemList().stream().forEach(i->{
            System.out.println("-" + i.getName() + " $" + i.getValue());
        });
        System.out.println("Total Items :" + this.invoice.getOrder().getTotalValue() );
        System.out.println("*******************DISCOUNTS**********************");
        this.invoice.getDiscountList().stream().forEach(i->{
            System.out.println("-" + i.getDescription() + " - " + i.getPorcent() + "%");
        });
        System.out.println("Total Porcentagem :" + this.invoice.getTotalDisountPorcentage()  + "%" );
        System.out.println("*******************OBSERVATIONS********************");
        System.out.println( this.invoice.getOrder().getObservations());
        System.out.println("*************************************************");
        System.out.println("Total Discount: $"+ this.invoice.getTotalDiscount());
        System.out.println("Total Value: $"+ this.invoice.getTotalInvoice());
        System.out.println("Date to Pay: "+ this.invoice.getDatePayment().format(formatter));
    }

}
