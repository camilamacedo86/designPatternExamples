package builder;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class Discount {
    private String description;
    private double porcent;

    public Discount(String description, double porcent) {
        this.description = description;
        this.porcent = porcent;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public double getPorcent() {
        return porcent;
    }

    private void setPorcent(double porcent) {
        this.porcent = porcent;
    }
}
