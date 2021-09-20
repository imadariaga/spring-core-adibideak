package eus.uni.dam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KaixoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaixoWebApplication.class, args);
	}

	@GetMapping("/")
	public String kaixo() {
		return "Kaixo, nabigatzen ari zaren horri!!!"; 
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/zenbatu")
	public String zenbatu(@RequestParam(value = "norarte", defaultValue = "9") String norarte) {

		String strEmaitza = "";
		for (int i = 1; i <= Integer.parseInt(norarte); i++) {
			strEmaitza += (i + "<br/>");
		}
		return strEmaitza;
	}
}
