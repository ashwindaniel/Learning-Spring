/**
 * 
 */
package com.aspiresys.ashwindaniel;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author ashwin.daniel
 *
 */
@SuppressWarnings("deprecation")
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
		work1();
		// work2();
	}

	private static void work1() {
		System.out.println("Inside Client Class work1() -- Starting Bean");
		// Spring Container - This will create all objects regardless of request
		// Using Application Context
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		// getBean
		Employee ref = (Employee) context.getBean("emp3954");

		System.out.println(ref);
		((AbstractApplicationContext) context).registerShutdownHook();
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		// shutdown context
		cxt.close();
	}

	private static void work2() {
		// Traditional Method
		Employee eRef1 = new Employee();
		eRef1.setEid(3954);
		eRef1.setEname("Ashwin Daniel");

		// Spring Method | Inversion of Control
		// Spring Container - This will only create object when you request
		// Using Bean Factory
		Resource resource = new ClassPathResource("Employee.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// Spring Container - This will create all objects regardless of request
		// Using Application Context
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");

		// getBean
		Employee eRef2 = (Employee) factory.getBean("emp3979");
		Employee eRef3 = (Employee) context.getBean("emp3954");
		System.out.println(eRef1);
		System.out.println(eRef2);
		System.out.println(eRef3);
		((AbstractApplicationContext) context).registerShutdownHook();
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		// shutdown context
		cxt.close();

	}
}
