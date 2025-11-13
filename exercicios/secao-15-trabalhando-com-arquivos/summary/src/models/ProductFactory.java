package models;

public class ProductFactory {

    public static Product fromCSV(String line) throws Exception {
        String[] parts = line.split(",");
        String name = parts[0];
        Double price = Double.parseDouble(parts[1]);
        Integer quantity = Integer.parseInt(parts[2]);

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        return product;
    }

}
