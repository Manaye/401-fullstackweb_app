package com.fullstackweb_app.fullstackweb_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class FullstackwebAppApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(FullstackwebAppApplication.class, args);
		System.out.println("http://localhost:8080");
	}


}

