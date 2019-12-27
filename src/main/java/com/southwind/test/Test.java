package com.southwind.test;

import com.southwind.aop.Cal;
import com.southwind.aop.CalImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Cal cal=(Cal)applicationContext.getBean("calImpl");
        System.out.println(cal.add(10,3));
    }



}
