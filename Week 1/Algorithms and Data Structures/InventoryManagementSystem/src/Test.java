public class Test {
    public static void main(String[] args) {
        Store inventory = new Store();

        // Adding products
        Product product1 = new Product("101", "Laptop", 10, 999.99);
        Product product2 = new Product("102", "Smartphone", 50, 499.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Display inventory
        System.out.println("Inventory after adding products:");
        inventory.displayInventory();

        // Updating a product
        product1.setPrice(899.99);
        inventory.updateProduct(product1);

        System.out.println("\nInventory after updating product:");
        inventory.displayInventory();

        // Deleting a product
        inventory.deleteProduct("102");

        System.out.println("\nInventory after deleting a product:");
        inventory.displayInventory();
    }
}
