/**
 * 
 */
package com.aspiresys.ashwindaniel;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author ashwin.daniel
 *
 */
public class Employee implements InitializingBean, DisposableBean {

	/**
	 * 
	 */
	private int eid;
	private String ename;
	private Address address;

	public Employee() {
		System.out.println("Inside Employee Constructor");
	}

	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	// Constructor injection
	public Employee(Address address) {
		this.address = address;
	}

	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}

	/**
	 * @param eid
	 *            the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename
	 *            the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	// Setter Injection
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/*
	 * Creating methods to demo life cycles of the bean
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

	@SuppressWarnings("unused")
	private void onInit() {
		System.out.println("inside onInit() method created");
	}

	@SuppressWarnings("unused")
	private void onDest() {
		System.out.println("inside onDest() method created");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertySet");
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy");
	}
}
