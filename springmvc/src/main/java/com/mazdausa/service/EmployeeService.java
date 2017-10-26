package com.mazdausa.service;

import java.util.List;

import com.mazdausa.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee p);

	public void updateEmployee(Employee p);

	public List<Employee> listEmployee();

	public Employee getEmployeeById(int id);

	public void removeEmployee(int id);

}