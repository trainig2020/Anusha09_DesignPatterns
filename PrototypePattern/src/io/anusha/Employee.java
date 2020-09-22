package io.anusha;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> empList;

	public Employee() {
		empList = new ArrayList<String>();
	}

	public Employee(List<String> empList) {
		super();
		this.empList = empList;
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("Anusha");
		empList.add("Akhila");
		empList.add("Prathyusha");
		empList.add("Amesha");
		empList.add("Naveen");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employee(temp);
	}

}
