package rw.ac.rca.ne.cedric.server.services;

import rw.ac.rca.ne.cedric.server.models.Quantity;

public interface IQuantityService {

    Quantity saveQuantity(Quantity quantity);

    Quantity saveQuantity();

    Quantity updateQuantity(Quantity quantity);
}
