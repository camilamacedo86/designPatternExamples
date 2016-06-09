package observer;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class Item {
    private String name;
    private double value;

    private Item() {
    }

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
