package eus.uni.dam;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AppPeliak {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);


		PeliculaDao peliDao = appContext.getBean(PeliculaDaoMemory.class);
		System.out.println("HASTERAKOAN:");
		for(Pelicula peli:peliDao.getPeliculas()) {
			System.out.println(peli);
	    }	
		
		Pelicula peliBerria = new Pelicula(11,"Gallipolli","1979",null);
		peliDao.insert(peliBerria);
		
		System.out.println("BUKATZERAKOAN:");
		for(Pelicula peli:peliDao.getPeliculas()) {
			System.out.println(peli);
	    }
		
		((AnnotationConfigApplicationContext) appContext).close();

	}

}
