package Java03.godoro.hw2;

import Java03.godoro.hw1.Product;

import java.util.Scanner;

public class ProductScan {
    public static Product readProductFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product ID:");
        int productId = scanner.nextInt();
        System.out.println("Enter Product Name:");
        String productName = scanner.next();
        System.out.println("Enter Sales Price:");
        double salesPrice = scanner.nextDouble();
        return new Product(productId, productName, salesPrice);
    }
}
