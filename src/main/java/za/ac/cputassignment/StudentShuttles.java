package za.ac.cputassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

//@Configuration
@EntityScan("za.ac.cputassignment.domain")
@EnableJpaRepositories (basePackages = "za.ac.cputassignment.Repository" )
@SpringBootApplication
public class StudentShuttles {

    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

    public static void main(String[] args)
    {
        SpringApplication.run(StudentShuttles.class, args);
    }

}
