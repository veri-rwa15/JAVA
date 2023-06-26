package rw.ac.rca.ne.cedric.server.services.impl;

import org.springframework.stereotype.Service;
import rw.ac.rca.ne.cedric.server.models.Quantity;
import rw.ac.rca.ne.cedric.server.repositories.QuantityRepository;
import rw.ac.rca.ne.cedric.server.services.IQuantityService;

@Service
public class QuantityService implements IQuantityService{



    private final QuantityRepository repository;

    public QuantityService(QuantityRepository repository) {
        this.repository = repository;
    }


    @Override
    public Quantity saveQuantity(Quantity quantity) {
        return repository.save(quantity);
    }


    @Override
    public Quantity saveQuantity() {
        return null;
    }

    @Override
    public Quantity updateQuantity(Quantity quantity) {
        Quantity existingQuantity= repository.findById(quantity.getId()).orElse(null);
        existingQuantity.setQuantity(quantity.getQuantity());

        return repository.save(existingQuantity);
    }


}
