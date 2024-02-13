package projects.commerce.warehouse.src;

public class Main
{
    public static void main(String[] args) {
        Store store = new Store();

        Warehouse warehouse = new Warehouse(store);

        //# Opprett mange forskjellige produkter
        Product product0 = new Product("Vaskemaskin", 1000.99);
        Product product1 = new Product("PlayStation 5", 10000);
        Product product2 = new Product("Nintendo Switch", 5000);


        // og legg de til i lageret

        //# Flytt varer fra lageret til butikken

        // Print ut varehusets verdi

        // Print ut butikkens verdi

        // Print ut samlet verdi
    }
}
