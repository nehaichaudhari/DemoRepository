package com.sorting;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private float marks;
	
	Student(){
		
	}
	
	Student(int id, String name, float marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name,marks);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Student s = (Student) obj;
		if(this.id!=s.id)
			return false;
		if(!this.name.equals(s.name))
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
