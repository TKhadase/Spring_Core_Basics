package com.tushar;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


public class TestApp 
{
    public static void main( String[] args )
    {
        System.out.println( "-----Application Started--------" );
        DefaultListableBeanFactory  factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/tushar/cfg/ApplicationContext.xml");
        
       Class clazz = factory.getBean("c1", Class.class);
       System.out.println( "clazz java.util.Date::" +clazz.getClass()+",  "+clazz.toString());
       
       Calendar cal = factory.getBean("calendar", Calendar.class);
       System.out.println( "Calendar ::" +cal.getClass()+",  "+cal.toString());
       
       Properties prop = factory.getBean("props", Properties.class);
       System.out.println( " Properties prop = ::" +prop.getClass()+",  "+prop.toString());
       
        System.out.println( "-----Application Completed--------" );
    }
}
