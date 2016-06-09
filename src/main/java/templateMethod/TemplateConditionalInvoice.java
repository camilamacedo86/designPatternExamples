package templateMethod;

/**
 * Created by camilamacedo on 6/7/16.
 */
public abstract class TemplateConditionalInvoice implements Tax {

    public double calculate(Invoice invoice) {

        if(isToApplyMaximunRate(invoice)) {
            return applyMaximumRate(invoice);
        } else {
            return applyMinimumRate(invoice);
        }
    }

    protected abstract boolean isToApplyMaximunRate(Invoice invoice);
    protected abstract double applyMaximumRate(Invoice invoice);
    protected abstract double applyMinimumRate(Invoice invoice);
}
