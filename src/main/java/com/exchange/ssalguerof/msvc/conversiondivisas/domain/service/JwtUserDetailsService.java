package com.exchange.ssalguerof.msvc.conversiondivisas.domain.service;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.userdetails.User;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("user".equals(username)) {
            // Definir las authorities (roles) del usuario
            List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));

            return new User("user", "$2a$10$juloCaGbIZH833Y7UI8QR.SbYkBd53YCKEV21kTRwImIlGBphfysi",
                    authorities); // contraseña es "password" codificada
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
