package ru.javamentor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("customHelloWorld");
    HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("customHelloWorld");
    System.out.println(helloWorld1.getMessage());


    boolean isSameHelloWorld = helloWorld1 == helloWorld2;
    System.out.println("Are the two HelloWorld beans the same? " + isSameHelloWorld); // должно быть true


    Cat cat1 = (Cat) applicationContext.getBean("customcat");
    Cat cat2 = (Cat) applicationContext.getBean("customcat");
    System.out.println(cat1.getName());


    boolean isSameCat = cat1 == cat2;
    System.out.println("Are the two Cat beans the same? " + isSameCat); // должно быть false
}

}