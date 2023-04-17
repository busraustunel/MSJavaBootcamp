package Java03.godoro.hw2;

import Java03.godoro.hw1.Product;

public class ProductFormat {
    public static void printProduct(Product product) {
        System.out.printf("Product ID: %d\nProduct Name: %s\nSales Price: %.2f\n",
                product.getProductId(), product.getProductName(), product.getSalesPrice());
    }
}

