package Ch07;

import java.util.List;

import java.util.function.Predicate;

public class EmployeeTestStreams {
	
	public static final EmployeeService employeeService = new EmployeeService();
	
	public static void main(String[] args) {		
		
		//Employees with experience > 10 years.
		System.out.println("Simple usage of stream,filter, collect");
		seniorEmployeesUsingStreams();
			
	}

	private static void seniorEmployeesUsingStreams() {
		Predicate<Employee> seniorProfessionals = (employee) -> employee.getExperience()>10; 
		List<Employee> seniors = employeeService.getEmployeesFilteredByImperative(seniorProfessionals);
		System.out.println(seniors);
	}
}

