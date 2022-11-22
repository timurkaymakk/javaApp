package kodlama.io.programmingLanguages;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.delivery.request"})
public class ProgrammingLanguagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgrammingLanguagesApplication.class, args);
	}

}
