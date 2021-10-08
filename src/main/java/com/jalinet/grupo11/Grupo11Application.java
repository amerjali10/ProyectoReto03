package com.jalinet.grupo11;

import com.jalinet.grupo11.service.CustomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = CustomeController.class)
public class Grupo11Application {

	public static void main(String[] args) {
		SpringApplication.run(Grupo11Application.class, args);
	}

}
