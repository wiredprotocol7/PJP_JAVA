class Person {
    String name, dateOfBirth;
    
    Person(String name, String dateOfBirth) {
    	this.name = name;
    	this.dateOfBirth = dateOfBirth;
    }
    
}

class Teacher extends Person {
	double salary;
    String subject;

    Teacher(String name, String dateOfBirth, String subject, double salary) {
    	super(name, dateOfBirth);
        this.subject = subject;
        this.salary = salary;
    }
    void printdetails() {
        System.out.println(" Name: " + name + ", Date of Birth: " + dateOfBirth + ", Subject: " + subject + ", Salary: " + salary);
    }
    
}

class Student extends Person {
	int studentId;
	
    Student(String name, String dateOfBirth, int studentId) {
    	super(name, dateOfBirth);
    	this.studentId = studentId;
	}

}

class CollegeStudent extends Student {
	String collegeName;
	String year;

    CollegeStudent(String name, String dateOfBirth, int studentId, String year, String CollegeName) {
    	super(name, dateOfBirth, studentId);
        this.year = year;
        this.collegeName = CollegeName;
    }
    
    void printdetails() {
        System.out.println(" Name: " + name + ", Date of Birth: " + dateOfBirth + ", Student ID: " + studentId + ", Year: " + year + ", College: " + collegeName);
    }

}

public class A03 {

	public static void main(String[] args) {

		Teacher teacher = new Teacher("Albedo","31/12/1995", "Alchemy", 80000);
		CollegeStudent collegeStudent = new CollegeStudent("Sucrose","26/01/2002", 001, "first", "Monstad Academy");
        
		teacher.printdetails();
		collegeStudent.printdetails();
	}

}
