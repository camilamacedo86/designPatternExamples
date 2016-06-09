package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by camilamacedo on 6/9/16.
 */
public class Order {
    private List<Item> itemList;
    private LocalDate date;
    private Double totalValue;
    private String observations;

    public Order(){
        date = LocalDate.now();
        this.itemList = new ArrayList<>();
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return this.getItemList().stream().mapToDouble(i->i.getValue()).sum();
    }

    private void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
