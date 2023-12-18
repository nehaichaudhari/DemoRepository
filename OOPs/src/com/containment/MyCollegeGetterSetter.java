package com.containment;

public class MyCollegeGetterSetter {
	public static void main(String[] args) {
		Course c1 = new Course(101,".net",23000f);
		
		Student s1 = new Student(1,"madhu",c1);
		Student s2 = new Student(2,"gauri",c1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		//2nd way using annonimus class
		
		Student s3= new Student();
		s3.setSid(2);
		s3.setSname("john");
		s3.setCourse(new Course());
		s3.getCourse().setCid(102);
		s3.getCourse().setCname("java");
		s3.getCourse().setFees(6500);
		System.out.println(s3);
		
	}

}
