package state;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class OrderApproved implements OrderState {

    @Override
    public void applyDiscountExtra(Order order) {
        order.value -= order.value * 0.05;
    }

    @Override
    public void approve(Order order) {
        order.currentState = new OrderApproved();
    }

    @Override
    public void refuse(Order order) {
        order.currentState = new OrderRefused();
    }

    @Override
    public void finish(Order order) {
        order.currentState = new OrderFinish();
    }
}
