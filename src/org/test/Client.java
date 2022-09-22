package org.test;

public class Client extends Employee {// child 2 inherits the properties of parent child
		public void cliId() {
			System.out.println("client id is 123");
	}
		public void cliName() {
	System.out.println("client name is queen");
		}
		public static void main(String[] args) {
			Client b = new Client();
		b.cliId();
		b.cliName();
		b.empId();
		b.empName();
		}
}
