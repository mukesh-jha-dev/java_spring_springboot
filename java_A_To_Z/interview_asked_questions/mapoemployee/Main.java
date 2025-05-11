package mapoemployee;

import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	Map<Employee,Employee> map=new HashMap<Employee, Employee>();
	Employee employee = new Employee(1, "Mukesh", 30, "Bihar");
	Employee employee2 = new Employee(2, "Abhishek", 29, "Jharkhand");
	Employee employee3 = new Employee(2, "Ramesh", 28, "UP");
	map.put(employee, employee);
	map.put(employee2, employee2);
	map.put(employee3, employee3);
	System.out.println(map);
}
}
