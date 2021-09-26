package eus.uni.dam;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AppTxtFileProbak {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);


		PeliculaDao peliDao = appContext.getBean(PeliculaDaoTextFile.class);
		
		((AnnotationConfigApplicationContext) appContext).close();

	}

}
