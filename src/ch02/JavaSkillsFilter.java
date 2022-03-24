package Ch02;

import employee.Employee;
import employee.Skill;

public class JavaSkillsFilter implements EmployeeFilter {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getSkills().contains(Skill.JAVA);
	}

}
