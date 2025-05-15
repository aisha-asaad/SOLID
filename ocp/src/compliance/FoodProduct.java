package compliance;

public class FoodProduct implements Taxable {
    private double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.05;
    }
}
