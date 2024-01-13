package com.external.project.auth;

import jakarta.annotation.PostConstruct;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService{


    private Map<String, String> users = new HashMap<>();

    @PostConstruct
    public void init() {
        users.put("yasin", "yasin");
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (users.containsKey(username)) {
            String password = users.get(username);
            return new org.springframework.security.core.userdetails.User(username, password, Collections.emptyList()); //Authorization kısmında bu liste değiştirilecek.
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }

}
