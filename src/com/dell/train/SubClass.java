package com.dell.train;

public class SubClass extends SuperClass {
	private String Department;
	
	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SuperClass su = new SuperClass();
		SubClass sc = new SubClass();
		sc.setName("anurag");
		sc.setNumber(007);
		sc.setDepartment("IT-SVC");
		System.out.println("Name-"+sc.getName()+"Number-"+sc.getNumber()+"Department-"+sc.getDepartment());
	}

}
