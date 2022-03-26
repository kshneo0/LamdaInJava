package Ch07;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
	
}
