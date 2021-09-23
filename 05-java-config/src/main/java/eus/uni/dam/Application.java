package eus.uni.dam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Pelicula p1 = appContext.getBean(Pelicula.class);
		Pelicula p2 = appContext.getBean(Pelicula.class);
		p1.setAnyo("2020");
		p2.setAnyo("2021");
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);

		((AnnotationConfigApplicationContext) appContext).close();

	}

}
