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
				
		//Employee names with multiple skills - sorted by exp- old way
		System.out.println("Sorting using imperative style:");
		namesWithMultipleSkillsSortedOldWay();
				
		//Employee names with multiple skills - sorted by exp - streams
		System.out.println("Sorting using declarative style:");
		namesWithMultipleSkillsSortedStreams();	
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
	
	
	//get emp names sorted by exp level but with more than one skill.
	private static void namesWithMultipleSkillsSortedOldWay() {
		List<String> namesWithSkills = employeeService.getEmployeeNamesWithMultipleSkillsImperative();
		System.out.println(namesWithSkills);
	}

	private static void namesWithMultipleSkillsSortedStreams() {
		List<String> namesWithSkillsStreams = employeeService.getEmployeeNamesWithMultipleSkillsStreams();
		System.out.println(namesWithSkillsStreams);
	}
}

