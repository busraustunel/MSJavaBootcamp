package Java03.godoro.hw1;

public class Product {
    private int productId;
    private String productName;
    private double salesPrice;

    public Product(int productId, String productName, double salesPrice) {
        this.productId = productId;
        this.productName = productName;
        this.salesPrice = salesPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesPrice() {
        return salesPrice;
    }
}

