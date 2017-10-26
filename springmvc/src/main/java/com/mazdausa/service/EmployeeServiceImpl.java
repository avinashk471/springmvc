package com.mazdausa.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mazdausa.dao.EmployeeDAO;
import com.mazdausa.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Transactional
	public void addEmployee(Employee e) {
		this.employeeDAO.addEmployee(e);
	}

	@Transactional
	public void updateEmployee(Employee e) {
		this.employeeDAO.updateEmployee(e);
	}

	@Transactional
	public List<Employee> listEmployee() {
		return this.employeeDAO.listEmployee();
	}

	@Transactional
	public Employee getEmployeeById(int id) {
		return this.employeeDAO.getEmployeeById(id);
	}

	@Transactional
	public void removeEmployee(int id) {
		this.employeeDAO.removeEmployee(id);
	}

}