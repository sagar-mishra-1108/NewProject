package interview.coding.tax;

public class MyMain {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        double totalTax1 = taxCalculator.calculateTax(500);
        System.out.println("Total tax for 500 is " + totalTax1);

        double totalTax2 = taxCalculator.calculateTax(350);
        System.out.println("Total tax for 350 is " + totalTax2);
    }
}
