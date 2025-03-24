package manyToMany;

public class student {
private String name;
private String mailId;
public student(String n,String mail)
{
	this.name=n; 
	this.mailId=mail;
}
public String getname()
{
	return name;
}
public String getmailId()
{
	return mailId;
}

}
