package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
  @Autowired
  private AuthenticationEntryPoint authEntryPoint;
  
  @Override
  protected void configure(HttpSecurity http) throws Exception {
	   
	http.csrf().disable();
	   
   /* http.authorizeRequests()
    .antMatchers("/", "/start","/logout/**").permitAll()
    .antMatchers("/greeting/**").hasRole("ADMIN")
    //.antMatchers("/**").hasAnyRole("ADMIN", "USER")
    .anyRequest().authenticated();*/
    
    http.headers().addHeaderWriter(
            new StaticHeadersWriter("Access-Control-Allow-Origin", "*"));
    
	// Use AuthenticationEntryPoint to authenticate user/password
	//http.httpBasic().authenticationEntryPoint(authEntryPoint).and().cors();
  }
   
   
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
    .passwordEncoder(passwordEncoder())
    .withUser("user").password(passwordEncoder().encode("123456789")).roles("USER")
    .and()
    .withUser("admin").password(passwordEncoder().encode("123456789")).roles("USER", "ADMIN");
  }
  
  @Bean
  public PasswordEncoder passwordEncoder(){
      return new BCryptPasswordEncoder();
  }
 
}


