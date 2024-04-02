package Reto.Monolito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableConfigurationProperties
@EnableEurekaClient
@SpringBootApplication
public class MonolitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonolitoApplication.class, args);
	}
//	@Bean
//	public UserDetailsService userDetailsService() throws Exception {
//		// ensure the passwords are encoded properly
//		User.UserBuilder users = User.withDefaultPasswordEncoder();
//		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//
//		manager.createUser(users.username("test").password("qa").roles("USER","ADMIN").build());
//		return manager;
//	}

//	@Bean
//	public CacheManager cacheManager() {
//		CaffeineCacheManager cacheManager = new CaffeineCacheManager();
//		cacheManager.setCaffeine(caffeineCacheBuilder());
//		return cacheManager;
//	}
//
//	Caffeine<Object, Object> caffeineCacheBuilder() {
//		return Caffeine.newBuilder()
//				.initialCapacity(100)
//				.maximumSize(500)
//				.expireAfterAccess(10, TimeUnit.MINUTES)
//				.weakKeys()
//				.recordStats();
//	}
}
