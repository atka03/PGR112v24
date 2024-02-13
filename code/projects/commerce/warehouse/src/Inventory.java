package projects.commerce.warehouse.src;

import java.util.HashMap;


public class Inventory
{
    HashMap<Product, Integer> products = new HashMap<>();

    void valueOfProducts() {
        // TODO regn ut verdien av alle produktene
        products.forEach((p,i)-> {
           double sum = 0;
           sum = sum + p.getPrice();
        });

    }

    void amountOfProducts() {
        products.forEach((p,i)->{
                    System.out.println(p.getName() + " price " + p.getPrice() + " And I have as many as: " + i + " " + p.getName());
        });
        /*
        for (Product x : products) {
            System.out.println(x.getName());
        }
         */
    }

    void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }

    void removeProduct(Product product) {
        products.remove(product);
    }
}
