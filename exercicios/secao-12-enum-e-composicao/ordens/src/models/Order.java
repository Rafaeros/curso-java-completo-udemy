package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import models.enums.OrderStatus;

public class Order {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime moment;
    OrderStatus status;
    Client client;
    List<OrdemItem> items = new ArrayList<>();

    public Order() {
        this.moment = LocalDateTime.now();
    }

    public Order(OrderStatus status, Client client) {
        this.moment = LocalDateTime.now();
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrdemItem> getItems() {
        return items;
    }

    public void addItem(OrdemItem item) {
        items.add(item);
    }

    public void removeItem(OrdemItem item) {
        items.remove(item);
    }

    public Double total() {
        Double sum = 0.0;
        for (OrdemItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + moment.format(fmt) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items:\n");
        for (OrdemItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }

}