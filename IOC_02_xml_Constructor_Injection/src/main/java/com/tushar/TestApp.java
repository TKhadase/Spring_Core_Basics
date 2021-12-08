package com.tushar;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.tushar.beans.MessageGenerator;

public class TestApp 
{
    public static void main( String[] args )
    {
        System.out.println( "-----constructor-injection Application Started--------" );
        XmlBeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/java/com/tushar/cfg/ApplicationContext.xml"));
        MessageGenerator generator= (MessageGenerator)factory.getBean("mGenerator");
        System.out.println( generator.generateMessgae());
        System.out.println( "-----Application Completed--------" );
    }
}
