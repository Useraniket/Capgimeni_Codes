package playing_with_objects;

public class Calculator {
private double num1;
private double num2;
private double result;

Calculator(double num1,double num2 )
{
	this.num1=num1;
	this.num2=num2;
}
public double getnum1()
{
	return num1;
}
public double getnum2()
{
	return num2;
}
public double getResult()
{
	return result;
}
public void setnum1(double num1)
{
	this.num1=num1;
}
public void setnum2(double num2)
{
	this.num2=num2;
}
public void setResult(double result)
{
	this.result=result;
}
public static Calculator add(Calculator c)
{
	c.setResult(c.getnum1()+c.getnum2());
    return c;
}
public static Calculator mul(Calculator c)
{
	c.setResult(c.getnum1()*c.getnum2());
    return c;
}


}
