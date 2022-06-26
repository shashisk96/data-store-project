package com.hiber.demo;

public class MainController {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(302);
		e.setName("Rajkumar");
		e.setSalary(9000.0);
		
		EmpDaoImpl dao=new EmpDaoImpl();
		
		System.out.println(dao.getAll());
		System.out.println(dao.getEmployeeById(301));
	}
}
