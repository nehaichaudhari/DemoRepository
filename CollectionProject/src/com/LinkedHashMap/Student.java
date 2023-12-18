package com.LinkedHashMap;

import java.util.Objects;



public class Student {
	private int id;
	private String name;
	private int marks;
	
	public Student()
	{
		super();
		
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(id,name,marks);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Student s=(Student) obj;
		if(this.id!=s.id)
			return false;
		if(!this.name.equals(name))
			return false;
		if(this.marks!=s.marks)
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
