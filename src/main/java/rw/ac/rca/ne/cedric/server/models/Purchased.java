package rw.ac.rca.ne.cedric.server.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "purchased")
@Getter
@Setter
public class Purchased {

    @Id
    @GeneratedValue
    private int id;

    private int quantity;
    private double total;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "product_code", referencedColumnName = "code")
    private Product product;

    // Constructor, getters, and setters
}
