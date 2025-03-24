package playing_with_objects;

public class Class {
 
	private int grade;
	private student[] students=new student[10];
	
	public Class(int grade)
	{
		this.grade=grade;
	}
	public int getgrade()
	{
		return grade;
	}
	
	int i=0;
	void addStudent(String name)
	{
		students[i]=new student(name);
		i++;
	}
	void display()
	{
		for(student i:students)
		{
			if(i!=null)
			System.out.println(i.getName());	
		}
	
	}
}
