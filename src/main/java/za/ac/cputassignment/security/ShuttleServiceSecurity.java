package za.ac.cputassignment.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//@Order(1)
public class ShuttleServiceSecurity extends WebSecurityConfigurerAdapter {

//    private static final String USER_ROLE ="USER";
//    private static final String ADMIN_ROLE ="ADMIN";
//
////    @Value("${user.oath.user.username}")
////    private String username;
////
////    @Value("${user.oauth.user.password}")
////    private String password;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth)
//        throws Exception{
//        auth
//                .inMemoryAuthentication()
//                .withUser("user")
//                .password(encoder().encode("password"))
//                .roles(USER_ROLE)
//                .and()
//                .withUser("admin")
//                .password(encoder().encode("admin"))
//                .roles(USER_ROLE,ADMIN_ROLE);
//
//    }
//
//    @Override
//    protected  void configure(HttpSecurity http)throws Exception{
//        http
//                    .httpBasic()
//                    .and()
//                    .authorizeRequests()
//                    .antMatchers(HttpMethod.POST,"/payroll/lookup/**/create/**").hasRole(ADMIN_ROLE)
//                    .and()
//                    .csrf().disable()
//                    .formLogin().disable();
//
//    }
//
//    @Bean
//    public PasswordEncoder encoder(){
//        return new BCryptPasswordEncoder();
//    }
//
}
