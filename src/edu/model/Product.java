package edu.model;

import java.time.LocalDate;
import java.util.Locale;

public class Product {

    private  Long id;
    private String name;
    private LocalDate suppliedDate;
    private int qty;
    private Double price;

    public Product() {
    }

    public Product(Long id, String name, LocalDate suppliedDate, int qty, Double price) {
        this.id = id;
        this.name = name;
        this.suppliedDate = suppliedDate;
        this.qty = qty;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getSuppliedDate() {
        return suppliedDate;
    }

    public void setSuppliedDate(LocalDate suppliedDate) {
        this.suppliedDate = suppliedDate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return " {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", suppliedDate=" + suppliedDate +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
