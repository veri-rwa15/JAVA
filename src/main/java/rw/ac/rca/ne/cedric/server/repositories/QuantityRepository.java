package rw.ac.rca.ne.cedric.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.ac.rca.ne.cedric.server.models.Quantity;

public interface QuantityRepository extends JpaRepository<Quantity,Integer> {

}
