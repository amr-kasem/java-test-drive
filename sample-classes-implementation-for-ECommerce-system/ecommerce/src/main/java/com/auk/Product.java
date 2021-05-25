package com.auk;

public class Product {
    private Marchant seller;
    public Marchant getSeller(){
        return seller;
    }
    private Category category;
    public Category getCategroy(){
        return category;
    }
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    private float price;
    public float getPrice(){
        return price;
    }
    public void setPrice(float p){
        price = p;
    }

    Product(Marchant m,Category c){
        seller = m;
        category = c;
        c.addProduct(this);
    }
}
