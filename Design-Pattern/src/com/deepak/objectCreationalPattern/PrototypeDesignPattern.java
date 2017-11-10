package com.deepak.objectCreationalPattern;

/**
 * @author deepak
 *
 */
class Employee implements Cloneable {
	private int empId;
	private String name;
	private String desination;
	private double salary;

	public Employee() {
		empId = 512;
		name = "Deepak";
		desination = "Assosiate Engineer";
		salary = 16000.00;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public String getDesination() {
		return desination;
	}

	public void empPromotion() {
		empId = 512;
		name = "Deepak";
		desination = "Software Engineer";
		salary = 30000.00;

	}

}

public class PrototypeDesignPattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee();
		Employee empModify = (Employee) emp.clone();
		PrototypeDesignPattern protype = new PrototypeDesignPattern();
		Employee hike=protype.getPromostion(empModify);
		System.out.println("Prototype Design Pattern  ::"+hike.getDesination());
	}

	public Employee getPromostion(Employee empModify) {
		empModify.empPromotion();
		return empModify;
	}

}
