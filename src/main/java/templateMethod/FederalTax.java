package templateMethod;

/**
 * Created by camilamacedo on 6/7/16.
 */
public class FederalTax extends TemplateConditionalInvoice {

    @Override
    public boolean isToApplyMaximunRate(Invoice invoice) {
        return invoice.getValue() > 500;
    }

    @Override
    protected double applyMaximumRate(Invoice invoice) {
        return invoice.getValue() * 0.70;
    }

    @Override
    protected double applyMinimumRate(Invoice invoice) {
        return invoice.getValue() * 0.50;
    }
}
