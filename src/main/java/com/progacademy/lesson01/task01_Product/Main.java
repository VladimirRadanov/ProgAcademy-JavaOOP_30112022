package com.progacademy.lesson01.task01_Product;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(30, "description1", 20);
        Product product2 = new Product(12.5, "description2", 50.12);
        Product product3 = new Product();

        product3.setPrice(10.123);
        product3.setDescription("description3");
        product3.setWeight(30.302);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }

}
