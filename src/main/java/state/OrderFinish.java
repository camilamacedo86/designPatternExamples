package state;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class OrderFinish implements OrderState {
    @Override
    public void applyDiscountExtra(Order order) {
        new RuntimeException("Order finished");
    }

    @Override
    public void approve(Order order) {
        new RuntimeException("Order finished");
    }

    @Override
    public void refuse(Order order) {
        new RuntimeException("Order finished");
    }

    @Override
    public void finish(Order order) {
        order.currentState = new OrderFinish();
    }
}
