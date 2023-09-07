package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Product;
import pl.coderslab.repositories.ProductRepository;

import java.util.List;

@Controller
public class ProductController {
    private final ProductRepository productRepository;
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/products")
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product show(@PathVariable Long id) {
        return productRepository.findById(id).orElseThrow();
    }
    @PostMapping("/products")
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }
    @PutMapping("/products/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        Product existingProduct = productRepository.findById(id).orElseThrow();
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);
    }
    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}