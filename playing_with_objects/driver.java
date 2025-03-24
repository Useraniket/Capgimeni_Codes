package playing_with_objects;

public class driver {
public static void main(String[] args) {
	passport pass=new passport("12345");
	person per=new person("Aniket",pass);
	System.out.println(per.getName());
	System.out.println(pass.getpassportNumber());
}
}
