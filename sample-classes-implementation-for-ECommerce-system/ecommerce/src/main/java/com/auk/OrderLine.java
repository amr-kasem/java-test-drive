package com.auk;
public class OrderLine {
    private Consumer buyer;
    public Consumer getBuyer(){
        return buyer;
    }
    private Product product;
    public Product getProduct(){
        return product;
    }
    public Marchant getSeller(){
        return product.getSeller();
    }
    public Category getCategory(){
        return product.getCategroy();
    }
    private int quantity;
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int q){
        quantity = q;
    }
    
    public float getSubtotalPrice(){
        return product.getPrice()*quantity;
    }
    OrderLine(Consumer buyer,Product item){
        this.buyer = buyer;
        product = item;
    }
}
