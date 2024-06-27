package dev.iratherfear.springintro.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "sheldon";
    }

    @Bean
    public int age() {
        return 15;
    }

    

    @Bean
    @Primary
    public String name2() {
        return "Rajesh";
    }

    @Bean(name="getname")
    @Qualifier("leonardname")
    public String name1() {
        return "Leonard";
    }

    @Bean
    public Person person1() {
        return new Person("Penny", 25);
    }
    
    @Bean
    public Person person2() {
        return new Person(name(), age());
    } 

    @Bean
    public Person person3(String getname, int age) {
        return new Person(getname, age);
    }

    @Bean 
    public Person person4(@Qualifier("leonardname") String name, int age) {
        return new Person(name, age);
    }
}

