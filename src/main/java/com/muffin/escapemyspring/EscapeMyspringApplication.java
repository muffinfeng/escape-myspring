package com.muffin.escapemyspring;

import com.muffin.escapemyspring.applicationContext.UseInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscapeMyspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscapeMyspringApplication.class, args);

		//第一种获取ApplicationContext的方式
//		SpringApplication application = new SpringApplication(EscapeMyspringApplication.class);
//		application.addInitializers(new UseInitializer());
//		application.run(args);
	}

}
