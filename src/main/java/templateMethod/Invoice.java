package templateMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class Invoice {

    private List<Item> itens = new ArrayList<>();
    public Invoice() {}


    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    public double getValue() {
        return this.getItens().stream().mapToDouble(i -> i.getValue()).sum();
    }

}

