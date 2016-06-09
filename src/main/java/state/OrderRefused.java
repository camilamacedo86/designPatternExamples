package state;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class OrderRefused implements OrderState {
    @Override
    public void applyDiscountExtra(Order order) {
        new RuntimeException("Order refused");
    }

    @Override
    public void approve(Order order) {
        new RuntimeException("Order refused");
    }

    @Override
    public void refuse(Order order) {
        order.currentState = new OrderRefused();
    }

    @Override
    public void finish(Order order) {
        new RuntimeException("Order refused");
    }
}
