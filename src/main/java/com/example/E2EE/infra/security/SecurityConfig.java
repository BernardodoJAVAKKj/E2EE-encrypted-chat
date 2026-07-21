package com.example.E2EE.infra.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public SecurityWebFilterChain securityWebFilterChain(HttpSecurity http) throws Exception {


        return http
                .csrf( cwsrf -> csrf.disable())

    }


}
