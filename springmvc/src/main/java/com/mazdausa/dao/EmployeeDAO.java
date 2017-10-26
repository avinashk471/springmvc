package com.mazdausa.dao;

import java.util.List;

import com.mazdausa.model.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee e);

	public void updateEmployee(Employee e);

	public List<Employee> listEmployee();

	public Employee getEmployeeById(int id);

	public void removeEmployee(int id);
}