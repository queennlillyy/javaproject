package org.test;

public class Company extends Employee {// child 1 inherits the properties of parent child
	public void compName() {
		System.out.println("company name is cts");
}
	public void complocation() {
System.out.println("company location is chennai");
	}
	public static void main(String[] args) {
		Company b = new Company();
	
	b.compName();
	b.complocation();
	b.empId();
	b.empName();
	}

}
