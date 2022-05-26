package pointwestproleague.pointwestpowerhouse.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pointwestproleague.pointwestpowerhouse.exception.UserNotFoundException;
import pointwestproleague.pointwestpowerhouse.model.Employee;
import pointwestproleague.pointwestpowerhouse.repository.EmpRepository;

@Service
public class EmployeeService {
	private final EmpRepository employeeRepo;
	
	@Autowired
	public EmployeeService(EmpRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	public Employee  addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}
	
//	FIND ALL EMPLOYEES
	public List<Employee> findAllEmployees() {
		return employeeRepo.findAll();
	}
	
//	FIND EMPLOYEE BY ID
	public Employee findEmployeeById(Integer id) {
		return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User with id "+id+" was not found"));
		
	}
//	UPDATE AN EMPLOYEE
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
//	DELETE AN EMPLOYEE
	public void deleteEmployee(Integer id) {
		employeeRepo.deleteEmployeeById(id);
	}
}
