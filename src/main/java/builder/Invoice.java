package builder;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class Invoice {

    private Order order;
    private double totalItens;
    private List<Discount> discountList;
    private double totalInvoice;
    private LocalDate date;
    private LocalDate datePayment;
    private LocalDate finishDate;

    public Invoice() {
        this.discountList = new ArrayList<>();
        this.discountList = new ArrayList<>();
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public Double getTotalDisountPorcentage(){
        return this.getDiscountList().stream().mapToDouble(i->i.getPorcent()).sum();
    }

    public List<Discount> getDiscountList() {
        return discountList;
    }

    private void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(LocalDate datePayment) {
        this.datePayment = datePayment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getTotalItens() {
        return totalItens;
    }

    private void setTotalItens(double totalItens) {
        this.totalItens = totalItens;
    }

    public double getTotalDiscount() {
        return this.getDiscountList().stream().mapToDouble( d-> d.getPorcent()).sum();
    }

    public double getTotalInvoice() {
        return totalInvoice;
    }

    public void setTotalInvoice(double totalInvoice) {
        this.totalInvoice = totalInvoice;
    }
}
