package eus.uni.dam;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
		CatalogoPeliculas ps = context.getBean(CatalogoPeliculas.class);
		System.out.println(ps.getPeliculas().size());
		for ( Pelicula p : ps.getPeliculas()) {
			System.out.println(p);
		}
		
		Pelicula p1 = context.getBean(Pelicula.class);
		p1.setTitulo("Captain Fantastic");
		
		Pelicula p2 = context.getBean(Pelicula.class);
		p2.setTitulo("Passengers");
		
		
		System.out.println(p1);
		System.out.println(p2);
				
		((ClassPathXmlApplicationContext) context).close();
	}
	

}
