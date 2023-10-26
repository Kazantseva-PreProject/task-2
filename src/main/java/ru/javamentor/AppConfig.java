package ru.javamentor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value = "ru.javamentor")
public class AppConfig {
 
    @Bean
    public HelloWorld customHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean
    @Scope("prototype")
    public Cat customcat(){
        Cat cat = new Cat();
        cat.setName("Bob");
        return cat;
    }
}