package dev.iratherfear.springintro;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.iratherfear.springintro.configuration.HelloWorldConfiguration;

@SpringBootApplication
public class SpringintroApplication {	

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			var name1 = context.getBean("name");
			System.out.println(name1);

			var name2 = context.getBean(String.class);
			System.out.println(name2);

			var name3 = context.getBean("getname");
			System.err.println(name3);
		}
	}

}
