package org.emp;
public class Employee {
	private void empId() {
		System.out.println("emp id is 1001");
	
	}
	private void empNAME() {
		System.out.println("emp name is saroj");

	}
	private void empDob() {
		System.out.println("emp dob is 02-02-1987");

	}
	private void empPhone() {
		System.out.println("emp phone is 123456");
		

	}
	private void empEmail() {
		System.out.println("emp email is saroj22@gmail.com");
		

	}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.empId();
		e.empNAME();
		e.empDob();
		e.empPhone();
		e.empEmail();
		
	}
	

}
