package variable_shadowing;

 public class child extends parent {
 String name="abc";
 void display()
 {
	 String name="local";
	 System.out.println(name);
	 System.out.println(this.name);
	 System.out.println(super.name);
 }
}
