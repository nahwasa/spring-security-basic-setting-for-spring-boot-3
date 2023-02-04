package com.nahwasa.springsecuritybasicsettingforspringboot3.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().disable()
                .authorizeHttpRequests()
                    .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                    .requestMatchers("/status", "/images/**").permitAll()
                    .anyRequest().authenticated()
                .and()
                .formLogin()
                    .loginPage("/view/login")
                    .loginProcessingUrl("/login-process")
                    .usernameParameter("id")
                    .passwordParameter("pw")
                    .defaultSuccessUrl("/view/dashboard", true)
                    .permitAll()
                .and()
                .logout(withDefaults());

        return http.build();
    }
}