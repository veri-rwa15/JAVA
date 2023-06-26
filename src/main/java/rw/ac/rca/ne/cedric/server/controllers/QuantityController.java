package rw.ac.rca.ne.cedric.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.ac.rca.ne.cedric.server.models.Quantity;
import rw.ac.rca.ne.cedric.server.services.impl.QuantityService;

import java.util.List;

@RestController
@RequestMapping("/quantity")

public class QuantityController {

    public QuantityController(QuantityService service) {
        this.service = service;
    }

    private QuantityService service;


    @PostMapping("/addQuantity")
    public Quantity addQuantity(@RequestBody Quantity quantity) {
        return service.saveQuantity(quantity);
    }


    @PutMapping("/update")
    public Quantity updateQuantity(@RequestBody Quantity quantity) {
        return service.updateQuantity(quantity);
    }

}
