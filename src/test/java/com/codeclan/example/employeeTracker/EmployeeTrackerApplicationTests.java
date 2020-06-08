package com.codeclan.example.employeeTracker;

import com.codeclan.example.employeeTracker.models.Employee;
import com.codeclan.example.employeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void canCreateAndSaveEmployee() {
		Employee employee = new Employee("Joe Bloggs", 25, 00001, "Joe.Bloggs@codeclan.com");
		employeeRepository.save(employee);
	}
}
