package observer;

import java.time.format.DateTimeFormatter;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class Printer implements ActionsAfterCloserInvoice {

    public void execute(Invoice invoice){
        System.out.println("*******************INVOICE**********************");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Invoice Date Emission :" + invoice.getFinishDate().format(formatter) );
        System.out.println("Invoice Date :" + invoice.getDate().format(formatter) );
        System.out.println("*******************ITEMS**********************");
        invoice.getOrder().getItemList().stream().forEach(i->{
            System.out.println("-" + i.getName() + " $" + i.getValue());
        });
        System.out.println("Total Items :" + invoice.getOrder().getTotalValue() );
        System.out.println("*******************DISCOUNTS**********************");
        invoice.getDiscountList().stream().forEach(i->{
            System.out.println("-" + i.getDescription() + " - " + i.getPorcent() + "%");
        });
        System.out.println("Total Porcentagem :" + invoice.getTotalDisountPorcentage()  + "%" );
        System.out.println("*******************OBSERVATIONS********************");
        System.out.println( invoice.getOrder().getObservations());
        System.out.println("*************************************************");
        System.out.println("Total Discount: $"+ invoice.getTotalDiscount());
        System.out.println("Total Value: $"+ invoice.getTotalInvoice());
        System.out.println("Date to Pay: "+ invoice.getDatePayment().format(formatter));
    }
}
