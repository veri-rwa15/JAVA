package rw.ac.rca.ne.cedric.server.services;

import org.springframework.stereotype.Service;
import rw.ac.rca.ne.cedric.server.models.Product;

import java.util.List;

public interface IProductService {

    Product saveProduct(Product product);

    List<Product> saveProducts(List<Product> products);

    Product saveProduct();

    List<Product> saveProducts();

    List<Product> getProducts();

    Product getProductById(int id);

    Product getProductByName(String name);

    String deleteProduct(int id);

    Product updateProduct(Product product);
}
