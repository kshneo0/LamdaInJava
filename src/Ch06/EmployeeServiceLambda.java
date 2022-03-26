package Ch06;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import employee.Employee;

public class EmployeeServiceLambda {	
	
	public List<Employee> getEmployeesFilteredBy(Predicate<Employee> filter) {

		List<Employee> employees = EmployeeUtil.initialize();
		
		List<Employee> filteredEmployee = new ArrayList<>();
		for (Employee employee : employees) {
			if (filter.test(employee)) {
				filteredEmployee.add(employee);
			}
		}
		return filteredEmployee;
	}
	
	
	//retrieve a list of employees that are sorted alphabetically by name
	public List<Employee> sortByName(){
		List<Employee> employees = EmployeeUtil.initialize();
		employees.sort(EmployeeSorterLambda.byNameAlphabetical);
		return employees;
	}
	
	/**Sort the employees with increasing experience and if they have the same experience, 
	then we sort them alphabetically by name.*/
	
	public List<Employee> sortByInreasingExpAndThenName(){
		List<Employee> employees = EmployeeUtil.initialize();
		employees.sort(EmployeeSorterLambda.byInrExpAndName);
		return employees;
	}
	
	/**
	 * Sort  the employees with decreasing experience 
	 * and if they have the same experience, then we sort them alphabetically by name.
	 */
	public List<Employee> sortByDecreasingExpAndThenName(){
		List<Employee> employees = EmployeeUtil.initialize();
		employees.sort(EmployeeSorterLambda.byDecExpAndName);
		return employees;
	}
	
	/**
	 * Exercise
	 * Top 3 methods can be combined into one.
	 * @param sorter - Pass behavior
	 * @return -Sorted list.
	 */
	public List<Employee> getEmployees(Comparator<Employee> sorter){
		List<Employee> employees = EmployeeUtil.initialize();
		Collections.sort(employees,sorter);
		return employees;
	}

}
