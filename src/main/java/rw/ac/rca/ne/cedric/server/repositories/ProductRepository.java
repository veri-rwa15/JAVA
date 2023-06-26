package rw.ac.rca.ne.cedric.server.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import rw.ac.rca.ne.cedric.server.models.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
