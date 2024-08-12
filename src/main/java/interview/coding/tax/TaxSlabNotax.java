package interview.coding.tax;

public class TaxSlabNotax implements TaxSlab {
    @Override
    public double calculateTax(double income) {
        return 0.0;
    }
}
