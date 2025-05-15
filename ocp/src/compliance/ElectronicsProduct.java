package compliance;

public class ElectronicsProduct implements Taxable {
    private double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price * 0.2;
    }
}