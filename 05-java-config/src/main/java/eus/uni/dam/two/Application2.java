package eus.uni.dam.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application2 {

	@Autowired//Ez dauka efekturik. Ez dot lortu autoinjektatzea. (getBean-i deitu behar dotzat)
	static CatalogoPeliculas cp;
    
	public static void main(String[] args) {
		ApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfig2.class);//CatalogoPeliculas bean-a sortuko da singleton dalako. Behar danean injektatuko da. 

		Pelicula p1 = appContext.getBean(Pelicula.class);//propotype scopea dekonez, Peli berri bat sortuko da
		Pelicula p2 = appContext.getBean(Pelicula.class);
		p1.setAnyo("2020");
		p2.setAnyo("2021");
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);

		cp=appContext.getBean(CatalogoPeliculas.class);//hau egin behar, @Autowired-ek ez dozte funtzionatzen
		cp.getPeliculas().add(p1);
		cp.getPeliculas().add(p1);
		
		((AnnotationConfigApplicationContext) appContext).close();

	}
}
