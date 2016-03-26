package org.infoowl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@EnableJpaRepositories
//@EnableAutoConfiguration
//@Import(RepositoryRestMvcConfiguration.class)
@SpringBootApplication
public class InternetMovieDatabaseApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(InternetMovieDatabaseApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InternetMovieDatabaseApplication.class);
	}
}