package mapoemployee;

import java.util.Objects;

public class Employee {
private int empId;
private String empName;
private int age;
private String address;
public Employee(int empId, String empName, int age, String address) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.age = age;
	this.address = address;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public boolean equals(Object obj) {
	if(this==obj) return true;
	if(obj==null || this.getClass()!=obj.getClass()) return false;
	Employee emp=(Employee) obj;
	return empId==emp.getEmpId() && Objects.equals(empName, emp.getEmpName()) && age==emp.getAge() &&
			Objects.equals(address, emp.getAddress());
}
@Override
public int hashCode() {
	return Objects.hash(empId,empName,age,empName);
}
@Override
public String toString() {
	return "Employee [empId="+empId+",empName="+empName+",age="+age+",address="+address+"]";
}
}
