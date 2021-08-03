package net.xdclass.demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"net.xdclass.controller","net.xdclass.package2"})
public class DemoProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoProjectApplication.class, args);
	}

}
