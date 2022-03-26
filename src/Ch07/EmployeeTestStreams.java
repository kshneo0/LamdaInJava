package Ch07;

import java.util.List;
import java.util.function.Predicate;

import employee.Skill;

public class EmployeeTestStreams {
	
	public static final EmployeeService employeeService = new EmployeeService();
	
	public static void main(String[] args) {		
		
		//Employees with experience > 10 years.
		System.out.println("Simple usage of stream,filter, collect");
		seniorEmployeesUsingStreams();
		
		//map example - get employee name with AngularJS skills.
				System.out.println("Example of map function");
				employeeNamesWithAngularJSSkills();
			
	}

	private static void seniorEmployeesUsingStreams() {
		Predicate<Employee> seniorProfessionals = (employee) -> employee.getExperience()>10; 
		List<Employee> seniors = employeeService.getEmployeesFilteredByImperative(seniorProfessionals);
		System.out.println(seniors);
	}
	
	private static void employeeNamesWithAngularJSSkills() {
		List<String> angularSkills = employeeService.getEmployeeNamesWith(Skill.ANGULARJS);
		System.out.println("Employees with angularjs skills : " + angularSkills);
	}
}

