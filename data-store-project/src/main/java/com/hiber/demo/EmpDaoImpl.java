package com.hiber.demo;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmpDaoImpl {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("crud");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveEmp(Employee emp) {
		et.begin();
		em.persist(emp);
		et.commit();
	}
	
	public ArrayList<Employee> getAll() {
		Query query=em.createQuery("select e from Employee e");
		return (ArrayList<Employee>) query.getResultList();
	}
	
	public Employee getEmployeeById(int id) {
		Employee emp=em.find(Employee.class,id);
		return emp;
	}
}
