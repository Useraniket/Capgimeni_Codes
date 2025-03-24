package manyToOne;

public class driver {
public static void main(String[] args) {
	product p=new product("mobile");
	 review r1=new review("Average",p);
	 review r2=new review("Good",p);
	 r1.display();
	 r2.display();
}

}
