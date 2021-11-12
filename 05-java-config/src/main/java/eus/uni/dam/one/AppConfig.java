package eus.uni.dam.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	@Scope("prototype")
	public Pelicula pelicula() {		
		return new Pelicula();
	}
	
	@Bean
	public CatalogoPeliculas getCatalogo() {
		return new CatalogoPeliculas();
	}
	
}
