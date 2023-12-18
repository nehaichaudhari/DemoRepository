package com.statickeyword;

class Student1{
	private int id;
    String name;
    float marks;
    static String scName; // first loaded
    static int sCount=0; 
    //instance block
    {
    	sCount++;
    }
    
    static void changeSchoolname(String sname)
    {
    	scName= sname;
    }
    
    Student1()
    {
    	scName="St Joseph";
    }
    
    Student1(int id, String name, float marks)
    {
    	this();
    	this.id=id;
    	this.name=name;
    	this.marks=marks;
    }
    
    //setter getter
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

    public String toString()
    {
    	return id+" "+name+" "+marks;
    }

}
public class StudentTset1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println(s1.scName);
		
		Student1 s2=new Student1();
		System.out.println(s2.scName);
		
		System.out.println("No of students: "+Student1.sCount);
		
		Student1.changeSchoolname("bishops school");
		System.out.println(s1.scName);
	}
}
