package chainOfResponsability;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class DiscountFiveItens implements Discount {
    private Discount next;

    @Override
    public double applyDiscount(Order order) {
        if(order.getItens().size() > 5 && order.getValue() > 500) {
            return order.getValue() * 0.2;
        }
        else {
            return next.applyDiscount(order);
        }
    }

    @Override
    public void callNext(Discount next) {
        this.next = next;
    }
}
