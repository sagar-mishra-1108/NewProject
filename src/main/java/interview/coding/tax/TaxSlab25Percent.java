package interview.coding.tax;

public class TaxSlab25Percent implements TaxSlab {
    private static final double LOWER_LIMIT = 400;
    private static final double TAX_RATE = 0.25;

    @Override
    public double calculateTax(double income) {
        if (income <= LOWER_LIMIT) {
            return 0.0;
        }
        double taxableIncome = income - LOWER_LIMIT;
        return taxableIncome * TAX_RATE;
    }
}
