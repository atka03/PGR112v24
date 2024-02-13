package projects.commerce.warehouse.src;

public class Main
{
    public static void main(String[] args) {
        Store store = new Store();

        Warehouse warehouse = new Warehouse(store);
        Inventory inventory = new Inventory();

        //# Opprett mange forskjellige produkter
        Product product0 = new Product("Vaskemaskin", 1000.99);
        Product product1 = new Product("PlayStation 5", 10000);
        Product product2 = new Product("Nintendo Switch", 5000);

        inventory.addProduct(product0, 100);
        inventory.addProduct(product1, 100);
        inventory.addProduct(product2, 100);

        //inventory.amountOfProducts(product0);

        inventory.amountOfProducts();

        inventory.valueOfProducts();

        // og legg de til i lageret


        //# Flytt varer fra lageret til butikken

        // Print ut varehusets verdi

        // Print ut butikkens verdi

        // Print ut samlet verdi
    }
}
