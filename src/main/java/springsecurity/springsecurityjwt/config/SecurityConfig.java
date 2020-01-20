package springsecurity.springsecurityjwt.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.websocket.OnClose;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("sung").password("1234");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests()
                                .antMatchers("/admin/**").hasRole("ADMIN")
                                .antMatchers("/sung/**").permitAll();
                http.formLogin();
    }
}

