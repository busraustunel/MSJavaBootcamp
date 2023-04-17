package Java03.godoro.hw1;

public class ConverterTest {
    public static void main(String[] args) {
        Product product = new Product(123, "Apple", 2.50);
        String formattedString = ProductConverter.format(product);
        System.out.println("Formatlanmış Veri : " + formattedString);
        Product parsedProduct = ProductConverter.parse(formattedString);
        System.out.println("Ayrılmış Veri: " + parsedProduct.getProductId() + " - " + parsedProduct.getProductName() + " - " + parsedProduct.getSalesPrice());
    }
}

