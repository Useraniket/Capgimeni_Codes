package playing_with_objects;

public class calcDriver {
  public static void main(String[] args) {
	Calculator c=new Calculator(10.7,5.8);
	Calculator.add(c).mul(c);
	System.out.println(c.getResult());
    
  }

}