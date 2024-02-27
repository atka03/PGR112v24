package projects.commerce.warehouse.src;

import java.util.HashMap;


public class Inventory
{
    HashMap<Product, Integer> products = new HashMap<>();

    double valueOfProducts() {
        // TODO regn ut verdien av alle produktene
        double totallSum = 0;

        int quantity = 0;
        for(Product product:products.keySet()){
            quantity = products.get(product);
            totallSum = product.getPrice() * quantity;
            System.out.println("Total sum for " + product.getName() + " :" + totallSum);
        }

        System.out.println("Total price: " + totallSum);
        return totallSum;
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
