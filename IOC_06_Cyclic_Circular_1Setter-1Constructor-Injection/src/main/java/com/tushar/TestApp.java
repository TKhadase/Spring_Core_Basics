package com.tushar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.tushar.beans.A;
import com.tushar.beans.B;



public class TestApp 
{
    public static void main( String[] args )
    {
        System.out.println( "-----Application Started--------" );
        DefaultListableBeanFactory  factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/tushar/cfg/ApplicationContext.xml");
        
        A objA = factory.getBean("aBean",A.class);
        System.out.println(objA);
        B objB = factory.getBean("bBean",B.class);
        System.out.println(objB);
        System.out.println( "-----Application Completed--------" );
    }
}
