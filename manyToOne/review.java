package manyToOne;

public class review {
private String message;
private product product;
public review(String message,product product){
	this.message=message;
	this.product=product; 
}
public String getmessage()
{
	return message;
}
public product getproduct()
{
	return product;
}
void display()
{
	System.out.println(product.getproduct_name());
	System.out.println(getmessage());
}
}
