package com.begin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
   @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
       httpSecurity
               .csrf().disable()
               .authorizeRequests()
               .antMatchers("/captchaImage","login")
               .anonymous();
   }

}
