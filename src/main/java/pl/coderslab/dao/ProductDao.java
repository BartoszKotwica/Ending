package pl.coderslab.dao;

import pl.coderslab.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static List<Product> products = new ArrayList<>();
    private static int idCounter = 1;

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        product.setId((long) idCounter++);
        products.add(product);
    }

    public void updateProduct(Product updateProduct) {
        for (Product product : products) {
            if(product.getId() == updateProduct.getId()) {
                product.setName(updateProduct.getName());
                product.setPrice(updateProduct.getPrice());
                product.setDescription(updateProduct.getDescription());
                product.setQuantity(updateProduct.getQuantity());
                product.setActive(updateProduct.isActive());
                break;
            }
        }
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }
}
