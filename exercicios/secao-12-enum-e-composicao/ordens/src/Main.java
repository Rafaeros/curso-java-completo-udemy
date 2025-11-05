import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import models.Order;
import models.enums.OrderStatus;
import models.Client;

public class Main {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String clientBirthDate = sc.nextLine();
        Client client = new Client(clientName, clientEmail, LocalDate.parse(clientBirthDate, fmt));
        order.setClient(client);
        order.setStatus(OrderStatus.PROCESSING);
        System.out.println("Enter order data:");
        System.out.print("Status: " + order.getStatus() + "\n");
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            order.addItem(new models.OrdemItem(quantity, productPrice, new models.Product(productName, productPrice)));
        }
        sc.close();
        
        System.out.println("\nORDER SUMMARY:");
        System.out.println(order.toString());

    }
}
