package com.codeclan.example.employees;

import com.codeclan.example.employees.models.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.codeclan.example.employees.repositories.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployees() {
		Employee jim = new Employee("Jim", 20, "OX214", "jim@aol.com");
		employeeRepository.save(jim);
	}

}
