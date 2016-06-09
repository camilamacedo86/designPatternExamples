package chainOfResponsability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class Order {


    private List<Item> itens = new ArrayList<>();

    public Order() {}

    public double getValue() {
        return this.getItens().stream().mapToDouble(i -> i.getValue()).sum();
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void addItem(Item item) {
        itens.add(item);
    }
}
