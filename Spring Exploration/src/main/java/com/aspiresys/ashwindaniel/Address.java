/**
 * 
 */
package com.aspiresys.ashwindaniel;

/**
 * @author ashwin.daniel
 *
 */
public class Address {

	/**
	 * 
	 */
	private String apartment;
	private String street;
	private String city;
	private String state;
	private int pin;

	public Address() {
	}

	public Address(String apartment, String street, String city, String state, int pin) {
		this.apartment = apartment;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	/**
	 * @return the apartment
	 */
	public String getapartment() {
		return apartment;
	}

	/**
	 * @param apartment
	 *            the apartment to set
	 */
	public void setapartment(String apartment) {
		this.apartment = apartment;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pin
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * @param pin
	 *            the pin to set
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [apartment=" + apartment + ", Street=" + street + ", City=" + city + ", State=" + state
				+ ", Pin=" + pin + "]";
	}

}
