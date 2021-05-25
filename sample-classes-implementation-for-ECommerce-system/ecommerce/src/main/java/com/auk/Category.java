package com.auk;

import java.util.ArrayList;
import java.util.List;
public class Category {
    private List<Product> products;
    private String name;

    public Category(String name){
        this.name = name;
        products = new ArrayList<Product>();
    }
    public String getName(){
        return name;
    }
    public void addProduct(Product p){
        products.add(p);
    }
    public Product[] getProducts(){
        return products.toArray(new Product[products.size()]);
    }
}
