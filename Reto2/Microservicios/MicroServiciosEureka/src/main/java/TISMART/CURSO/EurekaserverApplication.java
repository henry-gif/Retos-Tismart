package TISMART.CURSO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;





@EnableConfigServer
@EnableEurekaServer
@SpringBootApplication

public class EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}
	@Bean
	public UserDetailsService userDetailsService() throws Exception {
		// ensure the passwords are encoded properly
		User.UserBuilder users = User.withDefaultPasswordEncoder();
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(users.username("user").password("new").roles("USER").build());
		manager.createUser(users.username("admin").password("hlokiq").roles("USER","ADMIN").build());
		return manager;
	}
}
