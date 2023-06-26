package rw.ac.rca.ne.cedric.server.utils.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import rw.ac.rca.ne.cedric.server.models.User;

import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPrinciple implements UserDetails {

    private Long id;

    private String firstname;
    private String phoneNumber;
    private String email;

    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority> authorities;


    public static UserPrinciple create(User user) {
        UserPrinciple userPrinciple = new UserPrinciple();

        userPrinciple.id = user.getId();
        userPrinciple.firstname = user.getFirstname();
        userPrinciple.phoneNumber= user.getPhoneNumber();
        userPrinciple.email = user.getEmail();
        userPrinciple.password = user.getPassword();
        userPrinciple.authorities = Collections.singletonList(new SimpleGrantedAuthority(user.getEmail()));

        return userPrinciple;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
