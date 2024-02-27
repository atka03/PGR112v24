package projects.commerce.store.src;

import java.util.HashMap;


public class Receipt
{
    //# Fields
    private final HashMap<Product, Integer> products;


    //# Constructors
    Receipt(HashMap<Product, Integer> products) {
        this.products = products;
    }


    //# Getter-methods
    HashMap<Product, Integer> getProducts() {
        return this.products;
    }


    //# Methods
    int totalPrice() {
        // TODO
        int totallSum = 0;
        int quantity;

        for(Product product:products.keySet()){
            quantity = products.get(product);
            totallSum = product.getPrice() * quantity;
        }
        return totallSum;
    }

    int totalProducts() {
        // TODO
        return 0;
    }
}
