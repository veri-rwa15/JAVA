package rw.ac.rca.ne.cedric.server.utils.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class RegisterDTO {

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String phoneNumber;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String password;
}
