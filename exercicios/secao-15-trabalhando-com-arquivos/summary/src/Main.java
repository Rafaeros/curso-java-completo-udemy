import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.Product;
import models.ProductFactory;

public class Main {

    /*
     * 1. Crie um programa para ler um arquivo `.csv` contendo dados de **itens
     * vendidos** e gerar um novo arquivo `summary.csv` dentro de uma subpasta
     * **out**, contendo apenas o nome do item e o valor total (preço × quantidade).
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        System.out.println("Enter the product data file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                Product product = ProductFactory.fromCSV(line);
                System.out.printf("Product: %s, Total Value: %.2f%n", product.getName(), product.totalValue());
                products.add(product);
            }

            File dir = new File("C:\\Temp\\out");
            if (!dir.exists()) {
                dir.mkdirs();
            }

            String outputPath = "C:\\Temp\\out\\summary.csv";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
                for (Product product : products) {
                    bw.write(product.toCSV());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
