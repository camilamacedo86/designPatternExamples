package chainOfResponsability;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class WhitoutDiscount implements Discount {
    @Override
    public double applyDiscount(Order order) {
        return 0;
    }

    @Override
    public void callNext(Discount next) {
        // Don' have the next one.
    }
}
