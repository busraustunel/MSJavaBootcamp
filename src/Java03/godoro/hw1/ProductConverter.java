package Java03.godoro.hw1;

public class ProductConverter {
    public static String format(Product product) {
        return product.getProductId() + "," + product.getProductName() + "," + product.getSalesPrice();
    }

    public static Product parse(String line) {
        String[] fields = line.split(",");
        int productId = Integer.parseInt(fields[0]);
        String productName = fields[1];
        double salesPrice = Double.parseDouble(fields[2]);
        return new Product(productId, productName, salesPrice);
    }
}

