package rw.ac.rca.ne.cedric.server.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {

    @Id
    private int code;
    private String name;
    private String productType;
    private double price;
    private Date inDate;
    private String image;

    @OneToMany(mappedBy = "product")
    private List<Purchased> purchases;

    @OneToMany(mappedBy = "product")
    private List<Quantity> quantities;

    // Constructor, getters, and setters
}
