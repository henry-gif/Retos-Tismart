package microserviciosHospital;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;


@EnableEurekaClient
@EnableConfigurationProperties
@SpringBootApplication
public class 	HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}
	@Bean
	public UserDetailsService userDetailsService() throws Exception {
		// ensure the passwords are encoded properly
		User.UserBuilder users = User.withDefaultPasswordEncoder();
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();

		manager.createUser(users.username("test").password("qa").roles("USER","ADMIN").build());
		return manager;
	}

}

