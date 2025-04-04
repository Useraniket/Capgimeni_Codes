package comparable;

public class exampl1 implements Comparable{
	int rollno;
	String name;
	double percentage;

	
	public exampl1(int rollno2, String name2, double percentage2) {
		this.rollno = rollno2;
		this.name = name2;
		this.percentage = percentage2;
	}


	@Override
	public String toString()
	{
		return rollno+"  "+name+"  "+percentage;
	}
	@Override
	public int compareTo(Object o)
	{
		//---------1rst way---------
//		exampl1 e=(exampl1)o; //downcasting
//		if(this.rollno<e.rollno)//e1<e2
//		{
//			return-1;
//		}
//		else if(this.rollno>e.rollno)//e1>e2
//		{
//			return 1;
//		}
//		else//e1==e2
//		{
//			return 0;
//		}
		//----------2nd way-----------
		exampl1 e=(exampl1)o;
//		return this.rollno-e.rollno;
		
		//to return the double pecentage we need to type cast 
		return Double.compare(this.percentage, e.percentage);
		
		
		
	}
}
