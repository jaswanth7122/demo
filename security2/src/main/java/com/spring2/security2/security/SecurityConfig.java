package com.spring2.security2.security;

import java.beans.Encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer.AuthorizationManagerRequestMatcherRegistry;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
    private  UserDetailsService userdetailsservice;
	@Bean
	public BCryptPasswordEncoder bcryptpasswordencoder() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		return encoder;
	}
    @Bean
	public AuthenticationProvider authprovider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userdetailsservice);
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		return provider;
		
	}
	@Bean
	public SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {
		http.csrf(customizer -> customizer.disable());
		http.authorizeHttpRequests(request -> request
				.requestMatchers("register")
				.permitAll()
				.anyRequest().authenticated());
		http.httpBasic(Customizer.withDefaults());
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
	}
	@Bean
	public AuthenticationManager authenticationmaneger(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
	
//	@Bean
//	public UserDetailsService userdetailsservice() {
//		UserDetails user = org.springframework.security.core.userdetails.User
//				.withDefaultPasswordEncoder()
//				.username("jassu")
//				.password("j@123")
//				.roles("USER")
//				.build();
//		UserDetails admin = org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder()
//				.username("admin")
//				.password("admin@123")
//				.roles("ADMIN")
//				 .build();
//		return new InMemoryUserDetailsManager(user,admin);
//	}
}
