package models;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double totalValue() {
        return this.price * this.quantity;
    }

    public String toCSV() {
        return name + "," + String.format("%.2f", totalValue());
    }

}