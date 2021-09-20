package eus.uni.dam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class IocBeansApplication3 {

	public static void main(String[] args) {
//Jaimito, Jorgito, Juanito (alfabetikoki) 
		
		
		//Kontestua hasieratu
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans03.xml");

		//Scope-a Singleton bada, lehenetsitakoa, objetu bakarra sortuko da 
		Pertsona p1=null;
		Pertsona p2 = null;

		
		p1 = appContext.getBean( Pertsona.class);
		p2 = appContext.getBean( Pertsona.class);
		
		p1.aurkeztu();
		p2.aurkeztu();
		
		p2.setIzena("Juanito");
		System.out.println("Aldaketaren ostean");
		p1.aurkeztu();
		p2.aurkeztu();
		
		//Testuingurua itxi
		((ClassPathXmlApplicationContext) appContext).close();
	}

}
