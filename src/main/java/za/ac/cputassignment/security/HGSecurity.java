package za.ac.cputassignment.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class HGSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected  void configure(AuthenticationManagerBuilder auth)throws Exception{


        auth.inMemoryAuthentication()
                .withUser("student")
                .password(("password"))
                .roles("USER")
                .and()
                .withUser("admin")
                .password(encoder().encode("password"))
                .roles("ADMIN");






    }

    private PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public PasswordEncoder getPasswordEndcode(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected  void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/studet","/arlertinfor").hasAnyRole("USER","ADMIN")
                .antMatchers("/","domainproject1").permitAll()
                .and().formLogin();


    }

}
