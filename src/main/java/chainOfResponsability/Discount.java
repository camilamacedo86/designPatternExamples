package chainOfResponsability;

/**
 * Created by camilamacedo on 6/7/16.
 */
public interface Discount {

    double applyDiscount(Order order);
    void callNext(Discount next);

}
