package ch02;

import employee.Employee;
import employee.Unit;

public class EDCFilter implements EmployeeFilter {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getUnit()== Unit.EDC;
	}

}
