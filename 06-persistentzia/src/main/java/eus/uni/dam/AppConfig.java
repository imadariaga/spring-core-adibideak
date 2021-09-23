package eus.uni.dam;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="eus.uni.dam")
@PropertySource("classpath:/application.properties")
public class AppConfig {

}
