package eus.uni.dam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class IocBeansApplication4 {

	public static void main(String[] args) {		
		
		//Kontestua hasieratu
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans04.xml");

		//scope = "prototype" => bi objetu desberdin, izen desberdina inprimatuko da, beraz. 
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
