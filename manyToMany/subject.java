package manyToMany;

public class subject {
 private  String subname;
 private  int duration;
	public subject(String name,int duration)
	{
		this.subname=name;
		this.duration=duration;
	}
	public  String getsubname()
	{
		return subname;
	}
	public  int getduration()
	{
		return duration;
	}
	public void setsubname(String sub)
	{
		this.subname=sub;
	}
	
}
