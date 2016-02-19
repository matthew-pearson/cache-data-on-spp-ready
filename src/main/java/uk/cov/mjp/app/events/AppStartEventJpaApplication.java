package uk.cov.mjp.app.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AppStartEventJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppStartEventJpaApplication.class, args);
	}
}
