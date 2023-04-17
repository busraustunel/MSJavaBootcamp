package Java03.godoro.hw2;

import Java03.godoro.hw1.Product;

public class Test {
    public static void main(String[] args) {
        Product product = new Product(123, "Apple", 2.50);

        System.out.println("Ürün Detayı:");
        ProductFormat.printProduct(product);

        System.out.println("Ürün Detayını Giriniz: ");
        Product newProduct = ProductScan.readProductFromConsole();

        System.out.println("Yeni Ürün Detayı:");
        ProductFormat.printProduct(newProduct);
    }
}
