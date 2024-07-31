public class test {
    public static void main(String[] args) {
        Product[] products = {
                new Product("101", "Laptop", "Electronics"),
                new Product("102", "Smartphone", "Electronics"),
                new Product("103", "Tablet", "Electronics"),
                new Product("104", "Headphones", "Accessories"),
                new Product("105", "Keyboard", "Accessories")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product result = LinearSearch.linearSearch(products, "Tablet");
        if (result != null) {
            System.out.println("Product found: " + result);
        } else {
            System.out.println("Product not found.");
        }

        // Binary Search
        System.out.println("\nBinary Search:");
        BinarySearch.sortProductsByName(products);  // Sort products before binary search
        result = BinarySearch.binarySearch(products, "Tablet");
        if (result != null) {
            System.out.println("Product found: " + result);
        } else {
            System.out.println("Product not found.");
        }
    }
}
