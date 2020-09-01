package com.amran.api.gateway.util;

import com.amran.api.gateway.model.UserEntity;
import com.amran.api.gateway.model.UserRoleEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author : Amran Hosssain on 6/26/2020
 */
public class UserDetail implements UserDetails {

    private static final long serialVersionUID = 1L;
    private Collection<? extends GrantedAuthority> authorities;
    private String password;
    private String username;
    private boolean accountNonLocked;


    public UserDetail(UserEntity user, boolean accountNonLocked) {
        this.username = user.getUserName();
        this.password = user.getPassword();
        this.authorities = translate(user.getUserRoleEntity());
        this.accountNonLocked = accountNonLocked;
    }


    private Collection<? extends GrantedAuthority> translate(UserRoleEntity role) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        String name = role.getRoleName().toUpperCase();
        if (!name.startsWith("ROLE_")) {
            name = "ROLE_" + name;
        }
        authorities.add(new SimpleGrantedAuthority(name));
        return authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
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
