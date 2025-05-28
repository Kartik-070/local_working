package com.apisupport.intro.sprOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprOneApplication implements CommandLineRunner {

	@Autowired
	apple obj ;
	@Autowired
	apple obj2;

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(SprOneApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
		obj2.eatApple();
//		to check if both the onjects are really different
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

		System.out.println(dbService.getData());
	}

}
