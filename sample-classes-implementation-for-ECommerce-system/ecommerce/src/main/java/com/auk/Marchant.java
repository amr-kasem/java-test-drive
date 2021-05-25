package com.auk;

import java.util.ArrayList;
import java.util.List;

public class Marchant extends Customer{
    private List<Product> products;
    public Product[] getProducts(){
        return products.toArray(new Product[products.size()]);
    }
    private float totalPurchase;
    public float getTotalPurchase(){
        return totalPurchase;
    }

    public void addProduct(String name,float price,Category c){
        Product p = new Product(this,c);
        p.setName(name);
        p.setPrice(price);
        products.add(p);
    }
    public Marchant(String n){
        super(n);
        products = new ArrayList<Product>();
    }
}
