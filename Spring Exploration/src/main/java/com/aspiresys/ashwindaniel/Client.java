/**
 * 
 */
package com.aspiresys.ashwindaniel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author ashwin.daniel
 *
 */
public class Client {

	/**
	 * The class shows difference between traditional method of object creation
	 * and Spring Way of Object Creation. Observe the ways Spring Containers are
	 * used.
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Traditional Method
		 Employee eRef1 = new Employee();
		 eRef1.setEid(3954);
		 eRef1.setEname("Ashwin Daniel");

		// Spring Method | Inversion of Control
		Resource resource = new ClassPathResource("Employee.xml");
		// Spring Container - This will only create object when you request
		// getBean
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);
		// Spring Container - This will create all objects regardless of request
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");

		Employee eRef2 = (Employee) factory.getBean("emp3979");
		Employee eRef3 = (Employee) context.getBean("emp3954");
		System.out.println(eRef1);
		System.out.println(eRef2);
		System.out.println(eRef3);
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		// shutdown contect
		cxt.close();
	}
}
