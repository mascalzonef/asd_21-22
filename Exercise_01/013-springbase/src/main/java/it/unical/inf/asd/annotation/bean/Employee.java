package it.unical.inf.asd.annotation.bean;

public class Employee
{
	public Employee() {
		System.out.println("Employee created");
	}
	private long id;

	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}