package com.icptechno.validateexample;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring boot validation",
				version = "1.0.0",
				description = "This project is for learning",
				termsOfService = "tresic",
				contact = @Contact(
						name = "Lakshan Chamara",
						email = "kdlc.info@gmail.com"


		),
				license = @License(
						name = "license",
						url = "tresic technologies"
				)
		)
)
public class ValidateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidateExampleApplication.class, args);
	}

}
