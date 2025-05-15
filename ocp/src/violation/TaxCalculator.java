package violation;

public class TaxCalculator {
    public double calculateTax(Product product) {
        if (product.getType().equals("food")) {
            return product.getPrice() * 0.05;
        } else if (product.getType().equals("electronics")) {
            return product.getPrice() * 0.2;
        }
        return 0;
    }
}