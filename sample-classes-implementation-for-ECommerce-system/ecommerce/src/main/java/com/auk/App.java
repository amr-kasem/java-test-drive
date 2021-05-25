package com.auk;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Consumer buyer = new Consumer("Ahmed");
        Marchant seller = new Marchant("Mohamed");
        Catalog  catalog = new Catalog();
        Category watches = new Category("watches");
        catalog.addCategory(watches);
        seller.addProduct("watch",(float)10.2,watches);
        buyer.getCart().addProduct(watches.getProducts()[0], 10);
        System.out.println(buyer.getCart().getProducts()[0].getProduct().getName());
        buyer.placeOrder();
        System.out.println(buyer.getCart().getProducts().length);
        System.out.println(buyer.getOrderList()[0].getDate());
        System.out.println(buyer.getOrderList()[0].getBuyer().getName());
        System.out.println(buyer.getOrderList()[0].getProducts()[0].getCategory().getName());
        System.out.println(buyer.getOrderList()[0].getProducts()[0].getSeller().getName());
        System.out.println(buyer.getOrderList()[0].getProducts()[0].getBuyer().getName());
        System.out.println(buyer.getOrderList()[0].getProducts()[0].getSubtotalPrice());
        System.out.println(buyer.getOrderList()[0].getProducts()[0].getQuantity());



        
    }
}
