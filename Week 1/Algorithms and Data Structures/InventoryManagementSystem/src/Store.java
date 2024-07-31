import java.util.HashMap;
import java.util.Map;

public class Store {
    private Map<String, Product> productMap;

    public Store() {
        productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (productMap.containsKey(product.getProductId())) {
            productMap.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(String productId) {
        if (productMap.containsKey(productId)) {
            productMap.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    public Product getProduct(String productId) {
        return productMap.get(productId);
    }

    public void displayInventory() {
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }
}
