package com.huron.demo.entity;

import org.springframework.context.ApplicationContext;
import com.huron.demo.entity.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Dog dog = (Dog)applicationContext.getBean("dogBean");
        System.out.println(dog);
    }
}
