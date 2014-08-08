package com.lemon.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * use xml configuration to retrieve bean.
 */
public class App {
    public static void main(String[] args) {
        //Instantiating a Spring IoC container.
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"services.xml"});
        //retrieve configured instance
        MessagePrinter messagePrinter = context.getBean("messagePrinter", MessagePrinter.class);
        //use configured instance
        messagePrinter.printMessage();
    }
}
