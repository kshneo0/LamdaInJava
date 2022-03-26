package Ch07;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import employee.Skill;


public class EmployeeService {
	
	//replace iteration - stream, if - filter, collect data.
	public List<Employee> getEmployeesFilteredByImperative(Predicate<Employee> filter) {

		List<Employee> employees = EmployeeUtil.initialize();
				
		return employees.stream()
						.filter(filter)
						.collect(Collectors.toList());
		
/*
		Stream<Employee> exmployeeStream = employees.stream();
		Stream<Employee> empFilter = exmployeeStream.filter(filter);
		return empFilter.collect(Collectors.toList());		
 */
		
		
/*		
		List<Employee> filteredEmployee = new ArrayList<>();
		
		for (Employee employee : employees) {
			if (filter.test(employee)) {
				filteredEmployee.add(employee);
			}
		}
		return filteredEmployee;
*/		
	}
	
	/**
	 * Return list of employee names using map method.
	 * @param skill -The skill to check.
	 * @return - List of employee names with angularjs skills.
	 */
	public List<String> getEmployeeNamesWith(Skill skill) {
		
		List<Employee> employees = EmployeeUtil.initialize();
		
		return employees.stream()
				.filter( employee -> employee.getSkills().contains(skill))
				.map(Employee::getName)
				.collect(Collectors.toList());
/*		
		List<String> employeeWithAngularJSSkills = new ArrayList<>();
		
		for(Employee employee : employees) {
			if(employee.getSkills().contains(skill)) {
				employeeWithAngularJSSkills.add(employee.getName());
			}
		}
		return employeeWithAngularJSSkills;
*/		
	}
	
	/**
	 * Just for reference, don't name methods like this.
	 * @return
	 */
	public List<String> getEmployeeNamesWithMultipleSkillsImperative() {
		List<Employee> employees = EmployeeUtil.initialize();

		List<Employee> moreThanOneSkill = new ArrayList<>();
		for (Employee e : employees) {
			if (null != e.getSkills() && e.getSkills().size() > 1) {
				moreThanOneSkill.add(e);
			}
		}
		Collections.sort(moreThanOneSkill, EmployeeSorter.BY_EXPERIENCE);
		List<String> names = new ArrayList<>();
		for (Employee e : moreThanOneSkill) {
			names.add(e.getName());
		}
		return names;
	}

	public List<String> getEmployeeNamesWithMultipleSkillsStreams() {
		List<Employee> employees = EmployeeUtil.initialize();
		return employees.stream()
//						.filter(emp-> Objects.nonNull(emp.getSkills()))
//				        .filter(emp -> emp.getSkills().size() >1)
				        .filter(emp -> null != emp.getSkills() && emp.getSkills().size() >1)
				        .sorted(EmployeeSorter.BY_EXPERIENCE)
				        .map( Employee::getName)
				        .collect(Collectors.toList());
	}
	
	// distinct - Get unique names of unit that is based on employee with java skills.
	public List<String> getUniqueUnitNamesWithJavaSkill() {
		List<Employee> employees = EmployeeUtil.initialize();
		return employees.stream()
				        .filter(employee -> employee.getSkills().contains(Skill.JAVA))
				        .map(employee -> employee.getUnit().getUnitName())	
				        .distinct()
				        .collect(Collectors.toList());
	}
	
}
