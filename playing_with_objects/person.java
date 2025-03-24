package playing_with_objects;

public class person {
private String name;
private passport passport;
 
person(String name,passport passport)
{
	this.name=name;
	this.passport=passport;
}
public String getName()
{
	return this.name;
}
public passport getpassport()
{
	return this.passport;
}
}
