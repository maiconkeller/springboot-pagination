package com.mobwink.paginacao.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.mobwink.paginacao.model.Employee;
import com.mobwink.paginacao.repository.EmployeeRepository;

@Component
public class DataLoaderConfig implements ApplicationRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		this.addEmployees();
		
	}

	private void addEmployees() {
		if (employeeRepository.count() > 0) return;
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Amelia"));
		employees.add(new Employee("Lily"));
		employees.add(new Employee("Emily"));
		employees.add(new Employee("Sophia"));
		employees.add(new Employee("Dylan"));
		employees.add(new Employee("Willow"));
		employees.add(new Employee("Jake"));
		employees.add(new Employee("Blake"));
		employees.add(new Employee("Benjamin"));
		employees.add(new Employee("Leo"));
		employees.add(new Employee("Seth"));
		employees.add(new Employee("Aidan"));
		employees.add(new Employee("Sam"));
		employees.add(new Employee("Kayla"));
		employees.add(new Employee("Ewan"));
		employees.add(new Employee("Elena"));
		employees.add(new Employee("Joseph"));
		employees.add(new Employee("Jenson"));
		employees.add(new Employee("Adam"));
		employees.add(new Employee("Alyssa"));
		employees.add(new Employee("Cameron"));
		employees.add(new Employee("Martha"));
		employees.add(new Employee("Logan"));
		employees.add(new Employee("Kai"));
		employees.add(new Employee("Sebastian"));
		employees.add(new Employee("Liah"));
		employees.add(new Employee("Elijah"));
		employees.add(new Employee("Bella"));
		employees.add(new Employee("Francesca"));
		employees.add(new Employee("Harley"));
		employees.add(new Employee("Zac"));
		employees.add(new Employee("Sara"));
		employees.add(new Employee("Stanley"));
		employees.add(new Employee("Tilly"));
		employees.add(new Employee("Matthew"));
		employees.add(new Employee("Leah"));
		employees.add(new Employee("Ewan"));
		employees.add(new Employee("Libby"));
		employees.add(new Employee("Annie"));
		employees.add(new Employee("Callum"));
		employees.add(new Employee("Jude"));
		employees.add(new Employee("Luke"));
		employees.add(new Employee("George"));
		employees.add(new Employee("Gabriel"));
		employees.add(new Employee("Owen"));
		employees.add(new Employee("Matilda"));
		employees.add(new Employee("Rose"));
		employees.add(new Employee("Harrison"));
		employees.add(new Employee("Liam"));
		
		employeeRepository.save(employees);
	}
	
	
	
}
