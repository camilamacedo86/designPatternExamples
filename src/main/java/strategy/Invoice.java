package strategy;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class Invoice {
    private double value;

    public Invoice(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    private void setValue(double value) {
        this.value = value;
    }

}

