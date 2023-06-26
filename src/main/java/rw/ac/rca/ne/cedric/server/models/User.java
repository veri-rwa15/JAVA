package rw.ac.rca.ne.cedric.server.models;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String firstname;

    @Column(unique = true)
    private String phoneNumber;

    @Column(unique = true)
    private String email;
    @JsonIgnore
    private String password;

}
