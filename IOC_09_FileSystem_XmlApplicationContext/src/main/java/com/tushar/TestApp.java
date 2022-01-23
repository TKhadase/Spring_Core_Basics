package com.tushar;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class TestApp 
{
    public static void main( String[] args )
    {
        System.out.println( "-----FileSystemXmlApplicationContext Application Started--------" );
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/tushar/cfg/ApplicationContext.xml");
        
       Class clazz = ctx.getBean("c1", Class.class);
       System.out.println( "clazz java.util.Date::" +clazz.getClass()+",  "+clazz.toString());
       
       Calendar cal = ctx.getBean("calendar", Calendar.class);
       System.out.println( "Calendar ::" +cal.getClass()+",  "+cal.toString());
       
       Properties prop = ctx.getBean("props", Properties.class);
       System.out.println( " Properties prop = ::" +prop.getClass()+",  "+prop.toString());
       
       ctx.close();
        System.out.println( "-----Application Completed--------" );
    }
}
