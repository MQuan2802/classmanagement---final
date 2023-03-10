package userloginmanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyUserDetail implements UserDetails {

    private User user;

    public String getid() {
        return user.getid();
    }

    public String getemail() {
        return user.getemail();
    }

    public MyUserDetail(User user) {
        this.user = user;
    }

    public boolean getverify() {
        return user.getverify();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public boolean isEnabled() {
        return true;
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
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (user.getverify()) {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getrole());
            return Arrays.asList(authority);
        } else {
            List rturn = new ArrayList<GrantedAuthority>();
            return rturn;
        }

    }

    @Override
    public int hashCode() {

        return this.user.getUsername().hashCode();

    }

    @Override
    public boolean equals(Object otherUser) {

        MyUserDetail other = (MyUserDetail) otherUser;

        return user.getUsername().equals(other.getUsername());
    }

}
