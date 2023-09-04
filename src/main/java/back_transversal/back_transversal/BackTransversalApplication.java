package back_transversal.back_transversal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = "back_transversal")
public class BackTransversalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackTransversalApplication.class, args);
	}

}
