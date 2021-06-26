package com.springboot.ms.hrservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ms.hrservice.model.Employee;
import com.springboot.ms.hrservice.models.EmployeeslList;

@RestController
@RequestMapping("/hr")
public class HrResources {
	
	List<Employee> employees = Arrays.asList(
			
			new Employee("E1", "Kindson", "Munonye", "Meditech"),
			new Employee("E2", "Lila", "Hardcastle", "Surgery"),
			new Employee("E3", "Solace", "Chucks", "Denistry")
			);
	
	        @RequestMapping("/employees")
			public EmployeeslList getEmployees(){
	        	EmployeeslList employeesList = new EmployeeslList();
	        	employeesList.setEmployees(employees);
	        	
				return employeesList;
			}
	        @RequestMapping("/employees/{Id}")
	        public Employee getEmployeeById (@PathVariable("Id") String Id) {
	        Employee e = employees.stream()
	        .filter(employee -> Id.equals(employee.getId()))
	        .findAny()
	        .orElse(null);
	        return e;
	        
}
}
