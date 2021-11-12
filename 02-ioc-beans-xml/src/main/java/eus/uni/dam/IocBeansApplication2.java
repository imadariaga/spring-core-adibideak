package eus.uni.dam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class IocBeansApplication2 {

	public static void main(String[] args) {
		
		//Kontestua hasieratu
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans02.xml");

		//Bean-ak erabili
		Pertsona p1=null;
		p1 = appContext.getBean(Pertsona.class); //Kontenedoreak dependentzia "injektatu" du
		p1.aurkeztu();
		
		//Testuingurua itxi
		((ClassPathXmlApplicationContext) appContext).close();
	}

}
