package chainOfResponsability;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class DiscountOrderBiggerThan500 implements Discount {
    private Discount next;

    @Override
    public double applyDiscount(Order order) {
        if(order.getValue() > 500) {
            return order.getValue() * 0.1;
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
