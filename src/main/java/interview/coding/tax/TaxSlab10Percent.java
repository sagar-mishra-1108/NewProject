package interview.coding.tax;

public class TaxSlab10Percent implements TaxSlab {
    private static final double LOWER_LIMIT = 100;
    private static final double UPPER_LIMIT = 200;
    private static final double TAX_RATE = 0.1;

    @Override
    public double calculateTax(double income) {
        if (income <= LOWER_LIMIT) {
            return 0.0;
        }
        double taxableIncome = Math.min(income, UPPER_LIMIT) - LOWER_LIMIT;
        return taxableIncome * TAX_RATE;
    }
}
