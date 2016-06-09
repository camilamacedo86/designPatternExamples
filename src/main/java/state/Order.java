package state;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class Order {

    protected double value;
    protected OrderState currentState; // veja a mudança aqui

    public Order(double value) {
        this.value = value;
        this.currentState = new OrderProgress();
    }

    public void applyDiscountExtra() {
        currentState.applyDiscountExtra(this);
    }

    public void approve() {
        currentState.approve(this);
    }

    public void refuse() {
        currentState.refuse(this);
    }

    public void finish() {
        currentState.finish(this);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public OrderState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }
}
