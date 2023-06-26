package rw.ac.rca.ne.cedric.server.services.impl;

import org.springframework.stereotype.Service;
import rw.ac.rca.ne.cedric.server.models.Product;
import rw.ac.rca.ne.cedric.server.repositories.ProductRepository;
import rw.ac.rca.ne.cedric.server.services.IProductService;

import java.util.List;

@Service
public class ProductService implements IProductService{



    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }


    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    @Override
    public Product saveProduct() {
        return null;
    }

    @Override
    public List<Product> saveProducts() {
        return null;
    }
    @Override
    public List<Product> getProducts() {
        return repository.findAll();
    }
    @Override
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
    @Override
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }
    @Override
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }
    @Override
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getCode()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setProductType(product.getProductType());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }


}
