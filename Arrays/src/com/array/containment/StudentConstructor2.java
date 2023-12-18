package com.array.containment;

public class StudentConstructor2 {
	static void countStudCourseWise(Student st[], Course cour[]) {
		int count;
		for(Course c: cour) {
			count=0;
			for(Student s:st) {
				if(s.getCourse().equals(c)) {
					count++;
				}
			}
			System.out.println(c+" "+count);
		}
	}
	public static void main(String[] args) {
		Course co[] = new Course[3];
		co[0]=new Course(101,"java",25000);
		co[1]=new Course(102,".net",35000);
		co[2]=new Course(103,"c++",20000);
		
		
		Student stud[] = new Student[6];
		
		stud[0]=new Student(1, "radha", co[1]);
		stud[1]=new Student(2, "shyam", co[2]);
		stud[2]=new Student(3, "ram", co[0]);
		
		//hard code getter setter
		stud[3]=new Student();
		stud[3].setSid(4);
		stud[3].setSname("john");
		stud[3].setCourse(co[0]);
		
		stud[4]=new Student(5, "rahul", co[1]);
		stud[5]=new Student(6, "rajesh", co[1]);
		
		/*for(Student s:stud) {
			System.out.println(s);
		}*/
		//System.out.println(Arrays.toString(stud));
		countStudCourseWise(stud, co);
	}

}
