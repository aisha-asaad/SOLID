package compliance;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        Taxable food = new FoodProduct(100);
        Taxable electronics = new ElectronicsProduct(200);

        System.out.println("Food tax: " + calculator.calculateTax(food));         // يطلع 5.0
        System.out.println("Electronics tax: " + calculator.calculateTax(electronics)); // يطلع 40.0
    }
}

