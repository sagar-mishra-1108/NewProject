package interview.coding.tax;

public class TaxCalculator {
    private final TaxSlabNotax notax;
    private final TaxSlab10Percent tenPercentTax;
    private final TaxSlab20Percent twentyPercentTax;
    private final TaxSlab25Percent twentyFivePercentTax;

    public TaxCalculator() {
        this.notax = new TaxSlabNotax();
        this.tenPercentTax = new TaxSlab10Percent();
        this.twentyPercentTax = new TaxSlab20Percent();
        this.twentyFivePercentTax = new TaxSlab25Percent();
    }

    public double calculateTax(double income) {
        double tax = 0.0;
        tax += notax.calculateTax(income);
        tax += tenPercentTax.calculateTax(income);
        tax += twentyPercentTax.calculateTax(income);
        tax += twentyFivePercentTax.calculateTax(income);
        return tax;
    }
}
