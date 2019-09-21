package za.ac.cputassignment.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ShuttleServiceSecurity extends WebSecurityConfigurerAdapter {

    private static final String USER_ROLE ="USER";
    private static final String ADMIN_ROLE ="ADMIN";

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
        throws Exception{
        auth
                .inMemoryAuthentication()
                .withUser("user")
                .password(encoder().encode("password"))
                .roles(USER_ROLE)
                .and()
                .withUser("admin")
                .password(encoder().encode("admin"))
                .roles(USER_ROLE,ADMIN_ROLE);

    }

}
