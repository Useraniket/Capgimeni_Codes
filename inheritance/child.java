package inheritance;

public class child extends person {
public child(String name, int age,int studentID) {
		super(name, age);
		this.studentID=studentID;
}
private int studentID;
public int getStudentId()
{
	return studentID;
}
public void setStudentId(int studentId)
{
	this.studentID=studentId;
}
void displayDetails()
{
	System.out.println("The parent name is:"+getName());
	System.out.println("The age is:"+getAge());
	System.out.println("The student ID is:"+getStudentId());
	
}
}
