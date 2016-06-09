package state;

/**
 * Created by camilamacedo on 6/9/16.
 */
public interface OrderState {
    void applyDiscountExtra(Order order);
    void approve(Order order);
    void refuse(Order order);
    void finish(Order order);
}
