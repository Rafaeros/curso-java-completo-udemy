import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.Product;
import models.ImportedProduct;
import models.UsedProduct;

public class Main {

    /*
     * 2. Fazer um programa para ler os dados de N
     * produtos (N fornecido pelo usuário). Ao final,
     * mostrar a etiqueta de preço de cada produto na
     * mesma ordem em que foram digitados.
     * Todo produto possui nome e preço. Produtos
     * importados possuem uma taxa de alfândega, e
     * produtos usados possuem data de fabricação.
     * Estes dados específicos devem ser
     * acrescentados na etiqueta de preço conforme
     * exemplo (próxima página). Para produtos
     * importados, a taxa e alfândega deve ser
     * acrescentada ao preço final do produto.
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        String name;
        Double price;

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String type = sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextDouble();
            sc.nextLine();
            if (type.equals("c")) {
                products.add(new Product(name, price));
            } else if (type.equals("u")) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                LocalDate manufactureDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, manufactureDate));
            } else if (type.equals("i")) {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                sc.nextLine();
                products.add(new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
