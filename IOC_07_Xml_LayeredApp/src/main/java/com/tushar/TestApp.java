package com.tushar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.tushar.BusinessObjects.EmployeeVo;
import com.tushar.controller.EmpController;

public class TestApp 
{
    public static void main( String[] args )
    {
        System.out.println( "-----Application Started--------" );
        EmployeeVo  empVO = null;
        DefaultListableBeanFactory  factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/tushar/cfg/ApplicationContext.xml");
        
        EmpController controller = factory.getBean("empController", EmpController.class);
        empVO =  new EmployeeVo();
        empVO.setEname("umesh");
        empVO.setEadd("PUNE");
        empVO.setBaseSal("10000");
        empVO.setPhone("1234567890");
        
        try {
        	System.out.println( controller.saveDetails(empVO));
		} catch (Exception e) {
			System.out.println( "Error Saving Employee Details" );
			
		}
        
        System.out.println( "-----Application Completed--------" );
    }
}
