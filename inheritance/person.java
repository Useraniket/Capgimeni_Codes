package inheritance;

public class person {
private String name;
private int age;
public person(String name,int age)
{
	this.name=name;
	this.age=age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

void  displayParentDetails()
{
	System.out.println("The parent name is:"+getName());
	System.out.println("The age is:"+getAge());
}
}
