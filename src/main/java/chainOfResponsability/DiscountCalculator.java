package chainOfResponsability;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class DiscountCalculator {

    public double calculate(Order order) {
        Discount d1 = new DiscountFiveItens();
        Discount d2 = new DiscountOrderBiggerThan500();
        Discount d3 = new WhitoutDiscount();

        d1.callNext(d2);
        d2.callNext(d3);

        return d1.applyDiscount(order);
    }

}
