package eus.uni.dam.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfig.class); 
        Pertsona p = appContext.getBean(Pertsona.class);//
        System.out.print(p);
    	((AnnotationConfigApplicationContext) appContext).close();

		
		
	}

}
