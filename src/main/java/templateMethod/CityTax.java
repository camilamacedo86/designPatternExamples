package templateMethod;

import java.util.Optional;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class CityTax extends TemplateConditionalInvoice {

    @Override
    public boolean isToApplyMaximunRate(Invoice invoice) {
        return invoice.getValue() > 500 && hasItemValueMoreThan100(invoice);

    }

    private boolean hasItemValueMoreThan100(Invoice invoice) {
        Optional<Item> invoiceOptional = invoice.getItens().stream()
                .filter(i -> i.getValue() > 100)
                .findFirst();
        return invoiceOptional.isPresent();
    }

    @Override
    protected double applyMaximumRate(Invoice invoice) {
        return invoice.getValue() * 0.10;
    }

    @Override
    protected double applyMinimumRate(Invoice invoice) {
        return invoice.getValue() * 0.60;
    }

}
