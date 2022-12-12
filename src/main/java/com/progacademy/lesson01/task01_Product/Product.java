package com.progacademy.lesson01.task01_Product;

public class Product {
    private double price;
    private String description;
    private double weight;

    public Product() {
    }

    public Product(double price, String description, double weight) {
        this.price = price;
        this.description = description;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }
}
