package dev.tutorial.model;

public class Student {
	private int id;
	private String name;
	private String className;

	public Student(int id, String name, String className) {
		this.id = id;
		this.name = name;
		this.className = className;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getClassName() {
		return className;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
